package com.dreams.vehicle.greenhouse_metrics.config;

import org.springframework.context.annotation.Configuration;

//@EnableKafka
@Configuration
public class KafkaConfig {
/*
    @Bean
    public ProducerFactory<String, VehicleEmission> producerFactory() {
        Map<String, Object> configProps = new HashMap<>();
        configProps.put("bootstrap.servers", "localhost:9092");
        configProps.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        configProps.put("value.serializer", "org.springframework.kafka.support.serializer.ErrorHandlingSerializer");
        return new DefaultKafkaProducerFactory<>(configProps);
    }

    @Bean
    public KafkaTemplate<String, VehicleEmission> kafkaTemplate() {
        return new KafkaTemplate<>(producerFactory());
    }
 */
}

