package com.edutecno.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="alumno_materia")
public class Alumnos_Materia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer id_alumno;
	private Integer id_materia;
	
/*	@ManyToOne
	//@JoinColumn(name="materia", referencedColumnName = "id")
	//@Column(name="id_materia")
	private Materia materia;
	@ManyToOne
	//@JoinColumn(name="alumno", referencedColumnName = "id")
	//@Column(name="id_alumno")
	private Alumno alumno;
*/
}
