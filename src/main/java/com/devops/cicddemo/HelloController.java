package com.devops.cicddemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "CI/CD Pipeline is working successfully!";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is healthy";
    }
}
