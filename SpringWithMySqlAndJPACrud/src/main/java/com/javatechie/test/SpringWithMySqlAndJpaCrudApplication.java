package com.javatechie.test;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringWithMySqlAndJpaCrudApplication {

	Logger log = LoggerFactory.getLogger(SpringWithMySqlAndJpaCrudApplication.class);

	@PostConstruct
	public void init() {
		log.info("Application Started");
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringWithMySqlAndJpaCrudApplication.class, args);
	}

}
