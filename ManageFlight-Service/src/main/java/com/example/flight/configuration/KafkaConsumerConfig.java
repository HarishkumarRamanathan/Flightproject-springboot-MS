package com.example.flight.configuration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import com.example.flight.model.FlightModelResponse;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class KafkaConsumerConfig {
    @Bean
    public ConsumerFactory<String, List<FlightModelResponse>> consumerFactory(){
        Map<String,Object> config = new HashMap<>();
        config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,"localhost:9092");
        config.put(ConsumerConfig.GROUP_ID_CONFIG,"group_id");
        ObjectMapper om = new ObjectMapper();
        JavaType type = om.getTypeFactory().constructParametricType(List.class, FlightModelResponse.class);
        return new DefaultKafkaConsumerFactory<>(config,new StringDeserializer(), new JsonDeserializer<List<FlightModelResponse>>(type, om, false));
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, List<FlightModelResponse>> fooListener(){
        ConcurrentKafkaListenerContainerFactory<String, List<FlightModelResponse>> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(consumerFactory());
        return factory;
    }
}