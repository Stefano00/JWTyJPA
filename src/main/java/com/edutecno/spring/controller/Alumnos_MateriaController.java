package com.edutecno.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.edutecno.spring.model.Alumnos_Materia;
import com.edutecno.spring.service.IAlumnos_MateriaService;



@RestController
@RequestMapping("api/v1/alumnos_materia")
public class Alumnos_MateriaController {

	@Autowired
	IAlumnos_MateriaService alumnos_materiaService;
	
	@GetMapping("/")
	@ResponseStatus(HttpStatus.OK)
	public List<Alumnos_Materia> findAll(){
		
		return (List<Alumnos_Materia>) alumnos_materiaService.findAll();
	}
	
	@PostMapping("create")
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Alumnos_Materia alumnos_materia) {
		alumnos_materiaService.save(alumnos_materia);
	}
	
}
