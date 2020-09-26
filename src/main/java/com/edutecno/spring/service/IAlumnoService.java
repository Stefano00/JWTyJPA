package com.edutecno.spring.service;

import java.util.List;

import com.edutecno.spring.model.Alumno;



public interface IAlumnoService {
	public void save(Alumno alumno);
	public Alumno findByRut(String rut);
	public List<Alumno> findAll();
	
}
