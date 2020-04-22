package com.FirstKafkaApp;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

public class Producer1 {

  public Producer1() {
    Properties properties = new Properties();

    // Specify where the server is at
    properties.put("bootstrap.servers", "localhost:9092");

    // Key Serializer to send message
    properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");

    // Value Serializer
    properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

    // Message
    ProducerRecord producerRecord = new ProducerRecord("PriyankaKhireTopic", "Some Kye", "Some Value");

    KafkaProducer kafkaProducer = new KafkaProducer(properties);

    kafkaProducer.send(producerRecord);

    kafkaProducer.close();



  }
}
