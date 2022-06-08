package com.myfirstpackage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServrApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServrApplication.class, args);
	}

}
