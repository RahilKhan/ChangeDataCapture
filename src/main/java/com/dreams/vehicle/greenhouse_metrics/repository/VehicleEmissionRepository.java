package com.dreams.vehicle.greenhouse_metrics.repository;

import com.dreams.vehicle.greenhouse_metrics.model.VehicleEmission;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleEmissionRepository extends MongoRepository<VehicleEmission, String> {
  List<VehicleEmission> findByVehicleType(final String vehicleType);
}
