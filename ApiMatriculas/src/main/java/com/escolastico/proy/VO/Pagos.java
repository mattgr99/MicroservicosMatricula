package com.escolastico.proy.VO;

import java.util.Calendar;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;


public class Pagos {
	
	private Long pagoId;
	private String pagoCodigo;
	private double pagoValor;	
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
