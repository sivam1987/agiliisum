package com.aglsum.test.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class AgiliisumIntTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgiliisumIntTestApplication.class, args);
	}

}
