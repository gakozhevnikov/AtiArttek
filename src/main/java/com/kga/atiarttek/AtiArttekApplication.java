package com.kga.atiarttek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
@PropertySource(value = "classpath:custom.properties")
public class AtiArttekApplication {

    public static void main(String[] args) {
        SpringApplication.run(AtiArttekApplication.class, args);
    }

}
