package com.example.flight.listener;

import java.util.List;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.flight.model.FlightModelResponse;


@Service
public class KafkaConsumerListener {

    private static final String TOPIC = "kafka_topic";

    @KafkaListener(topics = TOPIC, groupId="group_id", containerFactory = "kafkaListenerContainerFactory")


    public void consumeJson(List<FlightModelResponse> flightModelResponses) {
        System.out.println("Consumed JSON Message: " + flightModelResponses);
    }
    
}
