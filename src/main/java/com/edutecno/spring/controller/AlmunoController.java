package com.edutecno.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.edutecno.spring.model.Alumno;
import com.edutecno.spring.service.IAlumnoService;




@RestController
@RequestMapping("/api/v1/alumns")
public class AlmunoController {

	@Autowired
	IAlumnoService alumnoService;
	
	@PostMapping("/")
	@ResponseStatus(HttpStatus.OK)
	public void create(@RequestBody Alumno alumno) {
		
		alumnoService.save(alumno);
	}
	
	@GetMapping("/{rut}")
	@ResponseStatus(HttpStatus.OK)
	public Alumno findByRut(@PathVariable String rut) {
		
		return (Alumno) alumnoService.findByRut(rut);
	}
	
	@GetMapping("/all")
	@ResponseStatus(HttpStatus.OK)
	public List<Alumno> findAll() {
				
		return (List<Alumno>)alumnoService.findAll();
	}
}
