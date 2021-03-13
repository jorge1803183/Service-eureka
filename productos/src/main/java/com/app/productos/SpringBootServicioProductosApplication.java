package com.app.productos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableEurekaClient
@SpringBootApplication
public class SpringBootServicioProductosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootServicioProductosApplication.class, args);
	}

}
