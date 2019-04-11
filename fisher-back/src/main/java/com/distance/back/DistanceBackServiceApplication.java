package com.distance.back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
@ComponentScan(basePackages = {"com.fisher.back", "com.fisher.common"})
public class DistanceBackServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DistanceBackServiceApplication.class, args);
    }
}
