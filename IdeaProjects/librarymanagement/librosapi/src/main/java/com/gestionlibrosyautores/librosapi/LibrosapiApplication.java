package com.gestionlibrosyautores.librosapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class LibrosapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibrosapiApplication.class, args);
	}

}
