package com.william;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Frontend Spring boot application with the non url pattern part and non url mapping in vaadin
 */
@SpringBootApplication
public class FrontendNoUrlMappingApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(FrontendNoUrlMappingApplication.class, args);
    }
    
}
