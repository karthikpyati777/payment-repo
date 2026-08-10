package com.example.payment.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @Value("${app.name}")
    private String applicationName;

    @GetMapping("/health")
    public String health() {
        return "Payment Service is UP";
    }

    @GetMapping("/payments")
    public String payments() {
        return "Payment service is processing payments";
    }

    @GetMapping("/config")
    public String config() {
        return "Application: " + applicationName;
    }
}