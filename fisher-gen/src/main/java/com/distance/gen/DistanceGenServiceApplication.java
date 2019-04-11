package com.distance.gen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = {"com.fisher.gen", "com.fisher.common"})
@SpringBootApplication
@EnableDiscoveryClient
public class DistanceGenServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DistanceGenServiceApplication.class, args);
    }

}
