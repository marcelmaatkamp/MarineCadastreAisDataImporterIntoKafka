package com.mycompany.myapp;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import com.mycompany.myapp.ais.parser.AISDataLexer;
import com.mycompany.myapp.shared.generation.domain.ExcludeFromGeneratedCodeCoverage;

import com.mycompany.myapp.ais.AISDataBasePojoListener;
import com.mycompany.myapp.ais.AISDataPojo;
import com.mycompany.myapp.ais.parser.AISDataLexer;
import com.mycompany.myapp.ais.parser.AISDataParser;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import java.io.IOException;


@SpringBootApplication
@ExcludeFromGeneratedCodeCoverage(reason = "Not testing logs")
public class JhipsterSampleApplicationApp {

  private static final Logger log = LoggerFactory.getLogger(JhipsterSampleApplicationApp.class);

  public static void main(String[] args) throws IOException {
    var configurableApplicationContext = SpringApplication.run(JhipsterSampleApplicationApp.class, args);
    var env = configurableApplicationContext.getEnvironment();

    if (log.isInfoEnabled()) {
      log.info(ApplicationStartupTraces.of(env));
    }
  }
}
