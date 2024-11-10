package com.mycompany.myapp.infrastructure.kafka.producer;

import java.util.concurrent.Future;

import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Repository;

import com.mycompany.myapp.ais.AISDataPojo;
import com.mycompany.myapp.shared.events.AISDataPojoEvent;

import jakarta.annotation.PostConstruct;

/**
 * AISDataProducer
 */
@Repository
public class AISDataProducer implements ApplicationListener<AISDataPojoEvent> {

  private static final Logger log = LoggerFactory.getLogger(AISDataProducer.class);

  private final Producer<String, AISDataPojo> kafkaProducer;

  private final String topicName;

  public AISDataProducer(@Value("${kafka.producer.topic}") String topicName,
      Producer<String, AISDataPojo> kafkaProducer) {
    this.kafkaProducer = kafkaProducer;
    this.topicName = topicName;
  }

  @PostConstruct
  public void init() {
    Runtime.getRuntime().addShutdownHook(new Thread(this::shutdown));
  }

  @Override
  public void onApplicationEvent(@SuppressWarnings("null") AISDataPojoEvent aisDataPojoEvent) {
    if(log.isDebugEnabled()) {
        log.debug("Received spring custom event - {}", aisDataPojoEvent.getAISDataPojo());
    }
    send(aisDataPojoEvent.getAISDataPojo());
  }

  public Future<RecordMetadata> send(AISDataPojo aisDataPojo) {
    final ProducerRecord<String, AISDataPojo> producerRecord = new ProducerRecord<>(topicName, aisDataPojo);
    if(log.isDebugEnabled()) {
      log.debug("Sending asynchronously a String producerRecord to topic: '{}'", topicName);
    }
    return kafkaProducer.send(producerRecord);
  }

  public void shutdown() {
      try (kafkaProducer) {
          log.info("Shutdown Kafka producer");
      }
  }
}
