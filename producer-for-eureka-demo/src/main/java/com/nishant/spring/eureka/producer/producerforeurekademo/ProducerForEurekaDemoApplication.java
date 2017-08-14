package com.nishant.spring.eureka.producer.producerforeurekademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProducerForEurekaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProducerForEurekaDemoApplication.class, args);
	}
}
