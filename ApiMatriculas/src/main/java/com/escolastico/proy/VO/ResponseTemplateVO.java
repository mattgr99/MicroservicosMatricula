package com.escolastico.proy.VO;

import com.escolastico.proy.entities.Matricula;

public class ResponseTemplateVO {
	
	
	private Matricula matricula;
	private Curso curso;
	private Pagos pago;
	private Persona persona;
	
	
	public Matricula getMatricula() {
		return matricula;
	}
	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public Pagos getPago() {
		return pago;
	}
	public void setPago(Pagos pago) {
		this.pago = pago;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	
	

}
