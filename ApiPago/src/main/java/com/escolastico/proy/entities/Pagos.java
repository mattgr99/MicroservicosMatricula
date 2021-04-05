package com.escolastico.proy.entities;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Pagos")
public class Pagos implements Serializable{

	/**
	 * 
	 * id:Long
       fecha:Date
       numero_Matricula:enum
       persona_enc: string
       periodo: String
       id_Persona: Long
       id_Pagos: Long
       id_Cursos: Long
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long pagoId;
	private String pagoCodigo;
	private double pagoValor;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)	
	private Calendar pagoFecha;
	private String pagoMotivo;
	private String pagoMetodo;
	
	
	public Long getPagoId() {
		return pagoId;
	}
	public void setPagoId(Long pagoId) {
		this.pagoId = pagoId;
	}
	public String getPagoCodigo() {
		return pagoCodigo;
	}
	public void setPagoCodigo(String pagoCodigo) {
		this.pagoCodigo = pagoCodigo;
	}
	public double getPagoValor() {
		return pagoValor;
	}
	public void setPagoValor(double pagoValor) {
		this.pagoValor = pagoValor;
	}
	public Calendar getPagoFecha() {
		return pagoFecha;
	}
	public void setPagoFecha(Calendar pagoFecha) {
		this.pagoFecha = pagoFecha;
	}
	public String getPagoMotivo() {
		return pagoMotivo;
	}
	public void setPagoMotivo(String pagoMotivo) {
		this.pagoMotivo = pagoMotivo;
	}
	public String getPagoMetodo() {
		return pagoMetodo;
	}
	public void setPagoMetodo(String pagoMetodo) {
		this.pagoMetodo = pagoMetodo;
	}
	
	

}

