package com.edutecno.spring.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="materia")
public class Materia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Enumerated(EnumType.STRING)
	private MateriasAlumno nombre;
	//@JsonBackReference
    
    @JoinTable(
            name = "alumno_materia",
            joinColumns = @JoinColumn(name = "id_materia", nullable = false),
            inverseJoinColumns = @JoinColumn(name="id_alumno", nullable = false)
        )
   // @JoinTable(name="alumno_materia")
    @ManyToMany(cascade = CascadeType.ALL)
    @JsonIgnore //ignora el bucle infinito
	private List<Alumno> alumno;
	@Override
	public String toString() {
		return "Materia [id=" + id + ", nombre=" + nombre + ", alumno=" + alumno + "]";
	}
	
	
}
