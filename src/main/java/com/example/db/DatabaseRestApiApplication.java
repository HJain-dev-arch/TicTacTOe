package com.example.db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class DatabaseRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatabaseRestApiApplication.class, args);
	}

}
