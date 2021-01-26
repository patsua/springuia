package com.ga.uia.app.Modelaciones.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Entity
@Table(name="transporte")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Transporte implements Serializable {
	
	/**
	 * 
	 */
    private static final long serialVersionUID = 1L;
	@Id
	@Column(name="numReg" , length = 10)
	private String numreg;
	
    public String getNumreg() {
		return numreg;
	}

	public void setNumreg(String numreg) {
		this.numreg = numreg;
	}

	@Column(name="id" , length = 10)
	private String id;
	
	@Column(name="municipio" , length = 30)
	private String municipio;
	
	@Column(name="tipocarga" , length = 30)
	private String tipocarga;
	
	@Column(name="unidad" , length = 30)
	private String  unidad;
	
	
	private Long costo;

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getTipocarga() {
		return tipocarga;
	}

	public void setTipocarga(String tipocarga) {
		this.tipocarga = tipocarga;
	}

	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}

	public Long getCosto() {
		return costo;
	}

	public void setCosto(Long costo) {
		this.costo = costo;
	}

	

	


}
