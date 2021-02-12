package com.example.kafkaclient;


import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaClient {
    @KafkaListener(topics = "test",groupId = "clienttest")
    public void onMessage(ConsumerRecord message){
        System.out.println( message.value());
    }
}
