package com.ga.uia.app.Agrocadena.Indicadores;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="indicadores")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Indicadores implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="num_reg" , length = 10)
	private String Numreg;
	
	@Column(name="idIndicador" , length = 20)
	private String idIndicador;
	
	@Column(name="nameindicador" , length = 20)
	private String nameIndicador;
	
	@Column(name="idVariable" , length = 30)
	private String idVariable;
	

	@Column(name="descripcion" , length = 100)
	private String descripcion;
	
	@Column(name="unidad" , length = 30)
	private String unidad;
	
	@Column(name="fuente" , length = 10)
	private String fuente;

	@Column(name="idagrocadena" , length = 10)
	private String idagrocaena;
	
	@Column(name="nameagrocadena" , length = 15)
	private String nameagrocadena;
	
	public String getIdagrocaena() {
		return idagrocaena;
	}

	public void setIdagrocaena(String idagrocaena) {
		this.idagrocaena = idagrocaena;
	}

	public String getNameagrocadena() {
		return nameagrocadena;
	}

	public void setNameagrocadena(String nameagrocadena) {
		this.nameagrocadena = nameagrocadena;
	}

	public String getIdIndicador() {
		return idIndicador;
	}

	public void setIdIndicador(String idIndicador) {
		this.idIndicador = idIndicador;
	}

	
	public String getNumreg() {
		return Numreg;
	}

	public void setNumreg(String numreg) {
		Numreg = numreg;
	}

	public String getIdVariable() {
		return idVariable;
	}

	public void setIdVariable(String idVariable) {
		this.idVariable = idVariable;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}

	public String getFuente() {
		return fuente;
	}

	public void setFuente(String fuente) {
		this.fuente = fuente;
	}

	public String getNameIndicador() {
		return nameIndicador;
	}

	public void setNameIndicador(String nameIndicador) {
		this.nameIndicador = nameIndicador;
	}
	
	

	
}
