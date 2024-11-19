package com.dreams.vehicle.greenhouse_metrics.producer;

import com.dreams.vehicle.greenhouse_metrics.model.VehicleEmission;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class EmissionProducer {

    private static final Logger logger = LoggerFactory.getLogger(EmissionProducer.class);
    private final KafkaTemplate<String, VehicleEmission> kafkaTemplate;

    public EmissionProducer(KafkaTemplate<String, VehicleEmission> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

//    public void sendEmission(VehicleEmission emission) {
//        kafkaTemplate.send("vehicle_emissions", emission);
//        logger.info("Sent emission to Kafka: {}", emission);
//    }
//
//    @KafkaListener(topics = "vehicle_emissions", groupId = "group_id")
//    public void consume(VehicleEmission emission) {
//        logger.info("-------------------Consumed message-------------------: {}", emission);
//    }
}

