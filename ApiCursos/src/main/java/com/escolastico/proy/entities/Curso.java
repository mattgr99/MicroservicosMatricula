package com.escolastico.proy.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "Curso")
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Curso implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long cursoId;
	private String cursoNrc;
	private String cursoNombre;
	private String cursoDescripcion;
	private Integer cursoCupo;
	
	public Long getCursoId() {
		return cursoId;
	}
	public void setCursoId(Long cursoId) {
		this.cursoId = cursoId;
	}
	public String getCursoNrc() {
		return cursoNrc;
	}
	public void setCursoNrc(String cursoNrc) {
		this.cursoNrc = cursoNrc;
	}
	public String getCursoNombre() {
		return cursoNombre;
	}
	public void setCursoNombre(String cursoNombre) {
		this.cursoNombre = cursoNombre;
	}
	public String getCursoDescripcion() {
		return cursoDescripcion;
	}
	public void setCursoDescripcion(String cursoDescripcion) {
		this.cursoDescripcion = cursoDescripcion;
	}
	public Integer getCursoCupo() {
		return cursoCupo;
	}
	public void setCursoCupo(Integer cursoCupo) {
		this.cursoCupo = cursoCupo;
	}
	
	

}
