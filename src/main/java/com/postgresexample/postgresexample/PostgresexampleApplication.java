package com.postgresexample.postgresexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// @Log
@ComponentScan
@EnableCaching
public class PostgresexampleApplication  {
	public static void main(String[] args) {

		SpringApplication.run(PostgresexampleApplication.class, args);

	}
}
