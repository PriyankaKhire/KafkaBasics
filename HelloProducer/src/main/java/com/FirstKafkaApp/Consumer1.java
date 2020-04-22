package com.FirstKafkaApp;

import java.util.Arrays;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

public class Consumer1 {

  public Consumer1() {

    Properties properties = new Properties();

    // Specify where the server is at
    properties.put("bootstrap.servers", "localhost:9092");

    // Specify group id
    properties.put("group.id", "groupName");

    // Key Deserializer to send message
    properties.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");

    // Value Deserializer
    properties.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");

    KafkaConsumer kafkaConsumer = new KafkaConsumer(properties);

    kafkaConsumer.subscribe(Arrays.asList("PriyankaKhireTopic"));

    while (true) {
      ConsumerRecords record = kafkaConsumer.poll(500);
      for (Object r : record) {
        System.out.println(r.toString());
      }
    }

  }

}
