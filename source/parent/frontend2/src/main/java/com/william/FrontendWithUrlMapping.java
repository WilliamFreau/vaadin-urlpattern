package com.william;

import jakarta.servlet.annotation.WebServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main Spring boot application with url-pattern and url-mapping
 */
@SpringBootApplication
@WebServlet(urlPatterns = "/my-app/*")
public class FrontendWithUrlMapping {
    
    public static void main(String[] args) {
        SpringApplication.run(FrontendWithUrlMapping.class, args);
    }
    
}
