package com.escolastico.proy.VO;

import java.util.Date;


public class Persona {
	
	private Long personaId;
    private String personaCedula;
	private String personaNombres;
	private String personaApellidos;	
	private Date personaFechanac;
	private String personaMail;
	
	public Long getPersonaId() {
		return personaId;
	}
	public void setPersonaId(Long personaId) {
		this.personaId = personaId;
	}
	public String getPersonaCedula() {
		return personaCedula;
	}
	public void setPersonaCedula(String personaCedula) {
		this.personaCedula = personaCedula;
	}
	public String getPersonaNombres() {
		return personaNombres;
	}
	public void setPersonaNombres(String personaNombres) {
		this.personaNombres = personaNombres;
	}
	public String getPersonaApellidos() {
		return personaApellidos;
	}
	public void setPersonaApellidos(String personaApellidos) {
		this.personaApellidos = personaApellidos;
	}
	public Date getPersonaFechanac() {
		return personaFechanac;
	}
	public void setPersonaFechanac(Date personaFechanac) {
		this.personaFechanac = personaFechanac;
	}
	public String getPersonaMail() {
		return personaMail;
	}
	public void setPersonaMail(String personaMail) {
		this.personaMail = personaMail;
	}
	
	
}
