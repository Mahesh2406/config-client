package com.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class ConfigClientApplication {

	@GetMapping("message")
	public String getMessage(){
		return "Hello World";
	}


	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}

}
