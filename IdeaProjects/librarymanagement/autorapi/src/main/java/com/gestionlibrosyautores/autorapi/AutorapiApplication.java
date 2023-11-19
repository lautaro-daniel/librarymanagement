package com.gestionlibrosyautores.autorapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
public class AutorapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutorapiApplication.class, args);
	}

}
