package com.ist_helper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootISTApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootISTApplication.class, args);
	}
}
