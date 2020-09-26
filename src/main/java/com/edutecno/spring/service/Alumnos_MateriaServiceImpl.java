package com.edutecno.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edutecno.spring.model.Alumnos_Materia;
import com.edutecno.spring.repository.IAlumno_MateriaRepository;



@Service
public class Alumnos_MateriaServiceImpl implements IAlumnos_MateriaService {

	@Autowired
	IAlumno_MateriaRepository alumnos_Materia;
	
	
	@Override
	public void save(Alumnos_Materia alumnos_materia) {
		alumnos_Materia.save(alumnos_materia);

	}


	@Override
	public List<Alumnos_Materia> findAll() {
		
		return (List<Alumnos_Materia>) alumnos_Materia.findAll() ;
	}

}
