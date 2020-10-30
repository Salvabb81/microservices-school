package com.salva.microservicios.app.examenes.services;

import java.util.List;

import com.salva.microservicios.commons.examenes.models.entity.Asignatura;
import com.salva.microservicios.commons.examenes.models.entity.Examen;
import com.salva.microservicios.commons.services.CommonService;

public interface ExamenService extends CommonService<Examen>{
	
	public List<Examen> findByName(String term);
	
	public Iterable<Asignatura> findAllAsignaturas();

}
