package com.mycompany.myapp.ais.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import com.mycompany.myapp.ais.AISDataBasePojoListener;
import com.mycompany.myapp.ais.parser.AISDataLexer;
import com.mycompany.myapp.ais.parser.AISDataParser;

@Configuration
public class AISDataParserConfiguration {

    @Bean
    public File inputFile() throws IOException {
        return new ClassPathResource("ais.csv").getFile();
    }

    @Bean
    public InputStream fileInputStream() throws IOException {
        return new FileInputStream(inputFile());
    }

    @Bean
    public CharStream charStream() throws IOException {
        return CharStreams.fromStream(fileInputStream());
    }

    @Bean
    public AISDataLexer aisDataLexer() throws IOException {
        return new AISDataLexer(charStream());
    }

    @Bean
    public CommonTokenStream commonTokenStream() throws IOException {
        return new CommonTokenStream(aisDataLexer());
    }

    @Bean
    AISDataBasePojoListener aisDataBasePojoListener() {
        return new AISDataBasePojoListener();
    }

    @Bean
    public AISDataParser aisDataParser() throws IOException {
        var parser = new AISDataParser(commonTokenStream());
        parser.addParseListener(aisDataBasePojoListener());
        return parser;
    }

    @Bean
    ParseTree parserTree() throws IOException {
        return aisDataParser().file();
    }
}