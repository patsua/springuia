package com.ga.uia.app.mercado.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="agrocadena")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Agrocadena {
	

	@Id
	@Column(name="numReg" , length = 10)
	private String NumReg;
	
	@Column(name="idVariable" , length = 50)
	private String idVariable;
	
	
	@Column(name="valor" , length = 25)
	private String valor;
	
	@Column(name="fecha" , length = 20)
	private String fecha;
	
	@Column(name="idIndicador" , length = 10)
	private String idIndicador;
	
	@Column(name="idAgrocadena" , length = 10)
	private String idAgrocadena;

	public String getNumReg() {
		return NumReg;
	}

	public void setNumReg(String numReg) {
		NumReg = numReg;
	}

	public String getIdVariable() {
		return idVariable;
	}

	public void setIdVariable(String idVariable) {
		this.idVariable = idVariable;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getIdIndicador() {
		return idIndicador;
	}

	public void setIdIndicador(String idIndicador) {
		this.idIndicador = idIndicador;
	}

	public String getIdAgrocadena() {
		return idAgrocadena;
	}

	public void setIdAgrocadena(String idAgrocadena) {
		this.idAgrocadena = idAgrocadena;
	}

}
