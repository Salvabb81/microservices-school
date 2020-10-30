package com.salva.microservicios.app.examenes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.salva.microservicios.app.examenes.models.repository.AsignaturaRepository;
import com.salva.microservicios.app.examenes.models.repository.ExamenRepository;
import com.salva.microservicios.commons.examenes.models.entity.Asignatura;
import com.salva.microservicios.commons.examenes.models.entity.Examen;
import com.salva.microservicios.commons.services.CommonServiceImpl;

@Service
public class ExamenServiceImpl extends CommonServiceImpl<Examen, ExamenRepository> implements ExamenService{

	@Autowired
	private AsignaturaRepository asignaturaRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Examen> findByName(String term) {
		return repository.findByName(term);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<Asignatura> findAllAsignaturas() {
		return asignaturaRepository.findAll();
	}

}
