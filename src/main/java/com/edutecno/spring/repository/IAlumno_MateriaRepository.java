package com.edutecno.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edutecno.spring.model.Alumnos_Materia;


@Repository
public interface IAlumno_MateriaRepository extends CrudRepository<Alumnos_Materia, Integer>{

}
