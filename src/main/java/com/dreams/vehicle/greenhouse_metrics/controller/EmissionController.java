package com.dreams.vehicle.greenhouse_metrics.controller;

import com.dreams.vehicle.greenhouse_metrics.service.EmissionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmissionController {

    private final EmissionService emissionService;

    public EmissionController(EmissionService emissionService) {
        this.emissionService = emissionService;
    }

    @GetMapping("/generate")
    public String generate() {
        return "Emission data generation started.";
    }
}
