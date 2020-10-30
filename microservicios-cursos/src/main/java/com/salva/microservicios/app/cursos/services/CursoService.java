package com.salva.microservicios.app.cursos.services;

import com.salva.microservicios.app.cursos.models.entity.Curso;
import com.salva.microservicios.commons.services.CommonService;

public interface CursoService extends CommonService<Curso>{

	public Curso findCursoByAlumnoId(Long id);
	
	public Iterable<Long> obtenerExamenesIdsConRespuestasAlumno(Long alumnoId);


}
