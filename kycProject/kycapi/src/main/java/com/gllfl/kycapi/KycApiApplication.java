package com.gllfl.kycapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class KycApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(KycApiApplication.class, args);
		System.out.println("Hello world!");

	}
	@Bean
	public WebClient webClient(){
		return WebClient.builder().build();
	}
}