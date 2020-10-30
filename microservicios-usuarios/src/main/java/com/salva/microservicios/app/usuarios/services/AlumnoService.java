package com.salva.microservicios.app.usuarios.services;

import java.util.List;

import com.salva.microservicios.commons.alumnos.models.entity.Alumno;
import com.salva.microservicios.commons.services.CommonService;

public interface AlumnoService extends CommonService<Alumno>{

	public List<Alumno> findByNameOrSurname(String term);
}
