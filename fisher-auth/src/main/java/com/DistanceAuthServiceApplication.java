package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.fisher.common", "com.fisher.auth"})
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class DistanceAuthServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DistanceAuthServiceApplication.class, args);
	}
}
