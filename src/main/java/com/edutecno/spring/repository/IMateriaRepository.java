package com.edutecno.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edutecno.spring.model.Materia;


@Repository
public interface IMateriaRepository extends CrudRepository<Materia, Long>{

}
