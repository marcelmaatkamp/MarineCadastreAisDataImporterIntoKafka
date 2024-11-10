package com.mycompany.myapp.ais.config;

import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import com.mycompany.myapp.ais.AISDataBasePojoListener;
import com.mycompany.myapp.ais.parser.AISDataLexer;
import com.mycompany.myapp.ais.parser.AISDataParser;

@Configuration
public class AISDataParserConfiguration {

    public InputStream fileInputStream(String aisImporterFilename) throws IOException {
        return new ClassPathResource(aisImporterFilename).getInputStream();
    }

    public CharStream charStream(String aisImporterFilename) throws IOException {
        return CharStreams.fromStream(fileInputStream(aisImporterFilename));
    }

    public AISDataLexer aisDataLexer(String aisImporterFilename) throws IOException {
        return new AISDataLexer(charStream(aisImporterFilename));
    }

    public CommonTokenStream commonTokenStream(String aisImporterFilename) throws IOException {
        return new CommonTokenStream(aisDataLexer(aisImporterFilename));
    }

    AISDataBasePojoListener aisDataBasePojoListener(
        ApplicationEventPublisher applicationEventPublisher, 
        boolean simulateRealtimeInserts) {
        return new AISDataBasePojoListener(applicationEventPublisher, simulateRealtimeInserts);
    }

    @Bean
    public AISDataParser aisDataParser(
        ApplicationEventPublisher applicationEventPublisher, 
        @Value("${application.input.filename}") String aisImporterFilename, 
        @Value("${application.simulateRealtimeInserts}") boolean simulateRealtimeInserts) throws IOException {
        AISDataParser parser = new AISDataParser(commonTokenStream(aisImporterFilename));
        parser.addParseListener(aisDataBasePojoListener(applicationEventPublisher, simulateRealtimeInserts));
        return parser;
    }

    @Bean
    ParseTree parserTree(
        ApplicationEventPublisher applicationEventPublisher, 
        @Value("${application.input.filename}") String aisImporterFilename, 
        @Value("${application.simulateRealtimeInserts}") boolean simulateRealtimeInserts) throws IOException {
        return aisDataParser(applicationEventPublisher, aisImporterFilename, simulateRealtimeInserts).file();
    }
}