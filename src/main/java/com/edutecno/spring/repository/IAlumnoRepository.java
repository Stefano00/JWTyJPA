package com.edutecno.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edutecno.spring.model.Alumno;



@Repository
public interface IAlumnoRepository extends CrudRepository<Alumno, Long>{

	public Alumno findByRut(String rut);
	
}
