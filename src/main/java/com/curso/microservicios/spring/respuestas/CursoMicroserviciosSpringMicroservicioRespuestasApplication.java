package com.curso.microservicios.spring.respuestas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CursoMicroserviciosSpringMicroservicioRespuestasApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursoMicroserviciosSpringMicroservicioRespuestasApplication.class, args);
	}

}
