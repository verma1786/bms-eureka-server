package com.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BmsEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BmsEurekaServerApplication.class, args);
	}

}
