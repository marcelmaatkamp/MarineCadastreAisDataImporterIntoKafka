package com.mycompany.myapp.ais.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mycompany.myapp.ais.AISDataBasePojoListener;
import com.mycompany.myapp.ais.parser.AISDataLexer;
import com.mycompany.myapp.ais.parser.AISDataParser;
import com.mycompany.myapp.ais.parser.AISDataParser.FileContext;

@Configuration
public class AISDataParserConfiguration {

    private static final Logger log = LoggerFactory.getLogger(AISDataParserConfiguration.class);

    public InputStream fileInputStream(String aisImporterFilename) throws IOException {
        return new FileInputStream(aisImporterFilename);
    }

    public CharStream charStream(String aisImporterFilename) {
        try (var inputStream = fileInputStream(aisImporterFilename)) {
            if(inputStream != null) {
                return CharStreams.fromStream(inputStream);
            } else { 
                log.error("While reading '{}': file not found!", aisImporterFilename);
                return null;
            }
        } catch (IOException e) {
            log.error("While reading '{}': {}", aisImporterFilename, e);
        }
        return null;
    }

    public AISDataLexer aisDataLexer(String aisImporterFilename) {
        return new AISDataLexer(charStream(aisImporterFilename));
    }

    public CommonTokenStream commonTokenStream(String aisImporterFilename) {
        return new CommonTokenStream(aisDataLexer(aisImporterFilename));
    }

    AISDataBasePojoListener aisDataBasePojoListener(
        ApplicationEventPublisher applicationEventPublisher, 
        boolean simulateRealtimeInserts, 
        int millisToWait,
        boolean appendZToDateTime) {
        return new AISDataBasePojoListener(
            applicationEventPublisher, simulateRealtimeInserts, millisToWait, appendZToDateTime);
    }

    public AISDataParser aisDataParser(
        ApplicationEventPublisher applicationEventPublisher, 
        String aisImporterFilename, 
        boolean simulateRealtimeInserts, 
        int millisToWait, 
        boolean appendZToDateTime) throws IOException {
        AISDataParser parser = new AISDataParser(commonTokenStream(aisImporterFilename));
        parser.addParseListener(
            aisDataBasePojoListener(applicationEventPublisher, simulateRealtimeInserts, millisToWait, appendZToDateTime));
        return parser;
    }
    
    @Bean
    FileContext parserTree(
        ApplicationEventPublisher applicationEventPublisher, 
        @Value("${application.input.filename}") String aisImporterFilename, 
        @Value("${application.simulateRealtimeInserts.enabled}") boolean simulateRealtimeInserts,
        @Value("${application.simulateRealtimeInserts.millisToWait}") int millisToWait,
        @Value("${application.appendZToDateTime}") boolean appendZToDateTime) throws IOException {
        return aisDataParser(applicationEventPublisher, aisImporterFilename, simulateRealtimeInserts, millisToWait, appendZToDateTime).file();
    }
}