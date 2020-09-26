package com.edutecno.spring.service;

import java.util.List;

import com.edutecno.spring.model.Alumnos_Materia;



public interface IAlumnos_MateriaService {

	public void save(Alumnos_Materia alumnos_materia);
	public List<Alumnos_Materia> findAll();
}
