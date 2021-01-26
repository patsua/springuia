package com.ga.uia.app.Agrocadena.Lacteos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="lacteos")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Lacteos implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="numReg" , length = 10)
	private String NumReg;
	
	@Column(name="idLacteos" , length = 20)
	private String idLacteos;
	
	@JsonProperty("valor")
	@Column(name="precio" , length = 15)
	private String precio;
	
	public String getNumReg() {
		return NumReg;
	}

	public void setNumReg(String numReg) {
		NumReg = numReg;
	}

	public String getIdLacteos() {
		return idLacteos;
	}

	public void setIdLacteos(String idLacteos) {
		this.idLacteos = idLacteos;
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

	@Column(name="fecha" , length = 20)
	private String fecha;

}
