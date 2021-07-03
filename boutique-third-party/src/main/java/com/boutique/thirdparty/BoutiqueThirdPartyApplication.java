package com.boutique.thirdparty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BoutiqueThirdPartyApplication {

    public static void main(String[] args) {
        SpringApplication.run(BoutiqueThirdPartyApplication.class, args);
    }

}
