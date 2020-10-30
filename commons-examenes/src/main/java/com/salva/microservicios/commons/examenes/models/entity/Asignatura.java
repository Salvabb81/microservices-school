package com.salva.microservicios.commons.examenes.models.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "asignaturas")
public class Asignatura {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nombre;
	
	@JsonIgnoreProperties(value= {"hijas", "handler", "hibernateLazyInitializer"})
	@ManyToOne(fetch = FetchType.LAZY)
	private Asignatura madre;
	
	@JsonIgnoreProperties(value = {"madre", "handler", "hibernateLazyInitializer"}, allowSetters = true)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "madre", cascade = CascadeType.ALL)
	private List<Asignatura> hijas;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Asignatura getMadre() {
		return madre;
	}

	public void setMadre(Asignatura madre) {
		this.madre = madre;
	}

	public List<Asignatura> getHijas() {
		return hijas;
	}

	public void setHijas(List<Asignatura> hijas) {
		this.hijas = hijas;
	}

	public Asignatura() {
		this.hijas = new ArrayList<>();
	}
	
}
