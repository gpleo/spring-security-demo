package com.gopersist.study.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApiLoginDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiLoginDemoApplication.class, args);
	}

	@RequestMapping("/ping")
	public String ping() {
		return "OK";
	}
}
