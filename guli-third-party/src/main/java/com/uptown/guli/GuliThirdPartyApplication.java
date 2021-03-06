package com.uptown.guli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GuliThirdPartyApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuliThirdPartyApplication.class, args);
    }

}
