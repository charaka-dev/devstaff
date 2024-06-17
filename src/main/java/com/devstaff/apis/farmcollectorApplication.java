package com.devstaff.apis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan
@EntityScan
@SpringBootApplication
@RestController
@RequestMapping(value = "/api")
public class farmcollectorApplication {

	public static void main(String[] args) {
		SpringApplication.run(farmcollectorApplication.class, args);
	}

}
