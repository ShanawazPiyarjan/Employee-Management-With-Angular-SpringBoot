package com.shanawaz.em;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class EmApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmApiApplication.class, args);
	}

}
