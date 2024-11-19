package com.dreams.vehicle.greenhouse_metrics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CarbonEmissionApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarbonEmissionApplication.class, args);
	}

}
