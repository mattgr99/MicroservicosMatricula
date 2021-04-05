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
@Table(name = "Persona")
public class Persona implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long personaId;
    private String personaCedula;
	private String personaNombres;
	private String personaApellidos;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)	
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
