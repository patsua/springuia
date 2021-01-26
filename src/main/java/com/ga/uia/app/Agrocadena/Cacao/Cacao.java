package com.ga.uia.app.Agrocadena.Cacao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="cacao")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Cacao implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="numReg" , length = 10)
	private String NumReg;
	
	@Column(name="idCacao" , length = 20)
	private String idCacao;
	
	@JsonProperty("valor")
	@Column(name="precio" , length = 15)
	private String precio;
	
	@Column(name="fecha" , length = 20)
	private String fecha;

	public String getNumReg() {
		return NumReg;
	}

	public void setNumReg(String numReg) {
		NumReg = numReg;
	}

	public String getIdCacao() {
		return idCacao;
	}

	public void setIdCacao(String idCacao) {
		this.idCacao = idCacao;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


}
