package com.example.aws_deployment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwsController {

    @GetMapping("/health")
    public String getHealthCheck() {
        return "Service is up and running, deployed in AWS ...!!";
    }

}
