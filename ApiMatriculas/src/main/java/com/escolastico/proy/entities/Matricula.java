package com.escolastico.proy.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Matricula")
public class Matricula implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long matriculaId;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)	
	private Date matriculaFecha;
    private String matriculaNumero;
	private String matriculaPersona;
	private String matriculaPeriodo;
	private Long personaId;
	private Long pagoId;
	private Long cursoId;
	public Long getMatriculaId() {
		return matriculaId;
	}
	public void setMatriculaId(Long matriculaId) {
		this.matriculaId = matriculaId;
	}
	public Date getMatriculaFecha() {
		return matriculaFecha;
	}
	public void setMatriculaFecha(Date matriculaFecha) {
		this.matriculaFecha = matriculaFecha;
	}
	public String getMatriculaNumero() {
		return matriculaNumero;
	}
	public void setMatriculaNumero(String matriculaNumero) {
		this.matriculaNumero = matriculaNumero;
	}
	public String getMatriculaPersona() {
		return matriculaPersona;
	}
	public void setMatriculaPersona(String matriculaPersona) {
		this.matriculaPersona = matriculaPersona;
	}
	public String getMatriculaPeriodo() {
		return matriculaPeriodo;
	}
	public void setMatriculaPeriodo(String matriculaPeriodo) {
		this.matriculaPeriodo = matriculaPeriodo;
	}
	public Long getPersonaId() {
		return personaId;
	}
	public void setPersonaId(Long personaId) {
		this.personaId = personaId;
	}
	public Long getPagoId() {
		return pagoId;
	}
	public void setPagoId(Long pagoId) {
		this.pagoId = pagoId;
	}
	public Long getCursoId() {
		return cursoId;
	}
	public void setCursoId(Long cursoId) {
		this.cursoId = cursoId;
	}
	
	

}
