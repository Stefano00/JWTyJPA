package com.edutecno.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edutecno.spring.model.Materia;
import com.edutecno.spring.repository.IMateriaRepository;


@Service
public class MateriaServiceImpl implements IMateriaService {

	@Autowired
	IMateriaRepository materiaRepository;
	
	@Override
	public void save(Materia materia) {
		materiaRepository.save(materia);
	}

	@Override
	public List<Materia> findAll() {
		
		return (List<Materia>) materiaRepository.findAll();
		
	}

}
