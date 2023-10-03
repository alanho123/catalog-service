package com.polarbookshop.catalogservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
@Slf4j
public class CatalogServiceApplication {
	private final Environment environment;

	public CatalogServiceApplication(Environment environment) {
		this.environment = environment;
	}

	public static void main(String[] args) {
//		SpringApplication.run(CatalogServiceApplication.class, args);
		SpringApplication app = new SpringApplication(CatalogServiceApplication.class);
		Environment env = app.run(args).getEnvironment();
		info(env);
	}

	private static void info(Environment env) {
		log.info("#### server info ####");
		log.info("## server port - {}", env.getProperty("server.port"));
	}

}
