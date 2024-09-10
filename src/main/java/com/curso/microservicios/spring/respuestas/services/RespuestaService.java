package com.curso.microservicios.spring.respuestas.services;

import com.curso.microservicios.spring.respuestas.models.entity.Respuesta;

public interface RespuestaService {

	public Iterable<Respuesta> saveAll(Iterable<Respuesta> respuestas);
	
}
