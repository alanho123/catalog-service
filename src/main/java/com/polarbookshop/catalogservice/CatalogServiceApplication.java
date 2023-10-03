package com.polarbookshop.catalogservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.core.env.Environment;

@SpringBootApplication
@Slf4j
@ConfigurationPropertiesScan
public class CatalogServiceApplication {

	@Value("${server.tomcat.connection-timeout}")
	private String connectionTimeout;

	public CatalogServiceApplication(Environment environment) {
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
		log.info("## connection timeout - {}", env.getProperty("server.tomcat.connection-timeout"));
	}

}
