package com.mycompany.myapp.wire.kafka.infrastructure.config;

import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mycompany.myapp.ais.AISDataPojo;

@Configuration
class KafkaConfiguration {

  @Bean
  public KafkaProducer<String, AISDataPojo> kafkaProducer(KafkaProperties kafkaProperties) {
    return new KafkaProducer<>(kafkaProperties.getProducer());
  }
}
