package com.lucianamella.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.lucianamella")
@EntityScan("com.lucianamella.models")
@EnableJpaRepositories(basePackages = "com.lucianamella.repositories")
public class Canciones1Application {

	public static void main(String[] args) {
		SpringApplication.run(Canciones1Application.class, args);
	}

}
