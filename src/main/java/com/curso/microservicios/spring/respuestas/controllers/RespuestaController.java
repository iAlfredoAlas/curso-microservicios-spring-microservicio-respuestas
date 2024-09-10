package com.curso.microservicios.spring.respuestas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.microservicios.spring.respuestas.models.entity.Respuesta;
import com.curso.microservicios.spring.respuestas.services.RespuestaService;

@RestController
public class RespuestaController {

	@Autowired
	private RespuestaService respuestaService;

	@PostMapping
	public ResponseEntity<?> crear(@RequestBody Iterable<Respuesta> respuestas) {
		Iterable<Respuesta> respuestasDb = respuestaService.saveAll(respuestas);
		return ResponseEntity.status(HttpStatus.CREATED).body(respuestasDb);
	}

}
