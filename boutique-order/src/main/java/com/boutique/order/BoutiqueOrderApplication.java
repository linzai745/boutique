package com.boutique.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BoutiqueOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BoutiqueOrderApplication.class, args);
    }

}
