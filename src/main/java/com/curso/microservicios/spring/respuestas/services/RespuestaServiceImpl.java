package com.curso.microservicios.spring.respuestas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.curso.microservicios.spring.respuestas.models.entity.Respuesta;
import com.curso.microservicios.spring.respuestas.models.repository.RespuestaRepository;

@Service
public class RespuestaServiceImpl implements RespuestaService {

	@Autowired
	private RespuestaRepository respuestaRepository;

	@Override
	@Transactional
	public Iterable<Respuesta> saveAll(Iterable<Respuesta> respuestas) {
		return respuestaRepository.saveAll(respuestas);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Respuesta> findRespuestaByAlumnoByExamen(Long alumnoId, Long examenId) {
		return respuestaRepository.findRespuestaByAlumnoByExamen(alumnoId, examenId);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Long> findExamenesIdsConRespuestasByAlumno(Long alumnoId) {
		return respuestaRepository.findExamenesIdsConRespuestasByAlumno(alumnoId);
	}

}
