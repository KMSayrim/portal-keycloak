package com.kafein.portalauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.kafein.portalauth")
public class PortalAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(PortalAuthApplication.class, args);
    }

}
