package com.springboot.eureka.naming.server.springbooteurekanamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringBootEurekaNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEurekaNamingServerApplication.class, args);
	}
}
