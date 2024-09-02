package com.curso.microservicios.spring.respuestas.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.curso.microservicios.spring.respuestas.models.entity.Respuesta;

public interface RespuestaRepository extends CrudRepository<Respuesta, Long> {

}
