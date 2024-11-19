package com.dreams.vehicle.greenhouse_metrics.service;

import com.dreams.vehicle.greenhouse_metrics.model.VehicleEmission;
import com.dreams.vehicle.greenhouse_metrics.repository.VehicleEmissionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class EmissionService {

    private static final Logger logger = LoggerFactory.getLogger(EmissionService.class);
    private final VehicleEmissionRepository vehicleEmissionRepository;

    public EmissionService(VehicleEmissionRepository vehicleEmissionRepository) {
        this.vehicleEmissionRepository = vehicleEmissionRepository;
    }

    @Scheduled(fixedRate = 5000) // Generate a new emission every 5 seconds
    private void generateRandomEmissions() {
        VehicleEmission emission = VehicleEmission.generateRandomEmission();
        try {
            vehicleEmissionRepository.save(emission);
            logger.info("Generated Vehicle Emission: Type = {}, Emission = {}", emission.getVehicleType(), emission.getCarbonEmission());
        } catch (Exception e) {
            logger.error("Error saving emission to MongoDB: {}", e.getMessage());
        }
    }
}
