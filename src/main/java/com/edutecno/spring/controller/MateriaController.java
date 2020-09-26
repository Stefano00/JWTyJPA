package com.edutecno.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edutecno.spring.model.Materia;
import com.edutecno.spring.service.IMateriaService;



@RestController
@RequestMapping("/api/v1/materia")
public class MateriaController {

	@Autowired
	IMateriaService materiaService;
	
	@PostMapping("/")
	public void create(@RequestBody Materia materia) {
		
		materiaService.save(materia);
	}
	
	@GetMapping("/all")
	public List<Materia> findALl() {
				
		return (List<Materia>) materiaService.findAll();
	}
}
