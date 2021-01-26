package com.ga.uia.app.Agrocadena.VerHor;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="verhor")
@JsonIgnoreProperties(ignoreUnknown = true)
public class VerHor implements Serializable {
	
	public String getNumReg() {
		return NumReg;
	}

	public void setNumReg(String numReg) {
		NumReg = numReg;
	}

	public String getIdVerHor() {
		return idVerHor;
	}

	public void setIdVerHor(String idVerHor) {
		this.idVerHor = idVerHor;
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

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="numReg" , length = 10)
	private String NumReg;
	
	@Column(name="idVerHor" , length = 25)
	private String idVerHor;
	
	@JsonProperty("valor")
	@Column(name="precio" , length = 25)
	private String precio;
	
	@Column(name="fecha" , length = 20)
	private String fecha;

}
