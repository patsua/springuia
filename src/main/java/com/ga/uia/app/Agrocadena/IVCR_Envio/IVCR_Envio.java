package com.ga.uia.app.Agrocadena.IVCR_Envio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="ivcr_envio")
@JsonIgnoreProperties(ignoreUnknown = true)
public class IVCR_Envio implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="numReg" , length = 10)
	private String NumReg;
	
	@JsonProperty("Año")
	@Column(name="fecha" , length = 20)
	private String fecha;

	
	@Column(name="id_ivcrenvio" , length = 20)
	private String id_ivcrenvio;
	
	@JsonProperty("Indice-ivcr")
	@Column(name="valor" , length = 25)
	private String valor;
	
	public String getNumReg() {
		return NumReg;
	}

	public void setNumReg(String numReg) {
		NumReg = numReg;
	}

	public String getId_ivcrenvio() {
		return id_ivcrenvio;
	}

	public void setId_ivcrenvio(String id_ivcrenvio) {
		this.id_ivcrenvio = id_ivcrenvio;
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
	
	
	

}
