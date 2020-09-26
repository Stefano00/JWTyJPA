package com.edutecno.spring.service;

import java.util.List;

import com.edutecno.spring.model.Materia;



public interface IMateriaService {
	public void save(Materia materia);
	public List<Materia> findAll();
}
