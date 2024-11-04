package com.mycompany.myapp.sample.infrastructure.secondary.kafka.producer;

import java.util.concurrent.Future;
import jakarta.annotation.PostConstruct;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import org.springframework.context.ApplicationListener;
import com.mycompany.myapp.shared.events.AISDataPojoEvent;
import com.mycompany.myapp.ais.AISDataPojo;


@Repository
public class AISDataProducer implements ApplicationListener<AISDataPojoEvent> {

  private static final Logger log = LoggerFactory.getLogger(AISDataProducer.class);

  private final Producer<String, AISDataPojo> kafkaProducer;

  private final String topicName;

  public AISDataProducer(@Value("${kafka.topic.sample}") String topicName, Producer<String, AISDataPojo> kafkaProducer) {
    this.kafkaProducer = kafkaProducer;
    this.topicName = topicName;
  }

  @PostConstruct
  public void init() {
    Runtime.getRuntime().addShutdownHook(new Thread(this::shutdown));
  }

  @Override
  public void onApplicationEvent(AISDataPojoEvent aisDataPojoEvent) {
      System.out.println("Received spring custom event - " + aisDataPojoEvent.getAISDataPojo());
      send(aisDataPojoEvent.getAISDataPojo());
  }

  public Future<RecordMetadata> send(AISDataPojo aisDataPojo) {
    final ProducerRecord<String, AISDataPojo> producerRecord = new ProducerRecord<>(topicName, aisDataPojo);
    log.info("Sending asynchronously a String producerRecord to topic: '{}'", topicName);
    return kafkaProducer.send(producerRecord);
  }

  public void shutdown() {
    log.info("Shutdown Kafka producer");
    kafkaProducer.close();
  }
}
