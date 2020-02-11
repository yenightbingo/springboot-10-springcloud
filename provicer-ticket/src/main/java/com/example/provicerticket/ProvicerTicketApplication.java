package com.example.provicerticket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ProvicerTicketApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProvicerTicketApplication.class, args);
    }

}
