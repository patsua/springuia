package com.ga.uia.app.Agrocadena.ICC_Envio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="iccenvio")
@JsonIgnoreProperties(ignoreUnknown = true)
public class IccEnvio implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="numReg" , length = 10)
	private String NumReg;
	
	@Column(name="idiccenvio" , length = 20)
	private String idiccenvio;
	
	@JsonProperty("Indice-iccenvio")
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

	public String getIdiccenvio() {
		return idiccenvio;
	}

	public void setIdiccenvio(String idiccenvio) {
		this.idiccenvio = idiccenvio;
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
