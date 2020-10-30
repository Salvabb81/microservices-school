package com.salva.microservicios.app.usuarios.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.salva.microservicios.app.usuarios.models.repository.AlumnoRepository;
import com.salva.microservicios.commons.alumnos.models.entity.Alumno;
import com.salva.microservicios.commons.services.CommonServiceImpl;

@Service
public class AlumnoServiceImpl extends CommonServiceImpl<Alumno, AlumnoRepository> implements AlumnoService{

	@Override
	@Transactional(readOnly = true)
	public List<Alumno> findByNameOrSurname(String term) {
		return repository.findByNameOrSurname(term);
	}


}
