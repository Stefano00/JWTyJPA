package com.edutecno.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edutecno.spring.model.Alumno;
import com.edutecno.spring.repository.IAlumnoRepository;



@Service
public class AlumnoServiceImpl implements IAlumnoService {

	@Autowired
	IAlumnoRepository alumnoRepository;
	@Override
	public void save(Alumno alumno) {
		alumnoRepository.save(alumno);
	}

	@Override
	public Alumno findByRut(String rut) {
		
		return (Alumno) alumnoRepository.findByRut(rut);
	}

	@Override
	public List<Alumno> findAll() {
		
		return (List<Alumno>)alumnoRepository.findAll();
	}

}
