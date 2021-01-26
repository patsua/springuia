package com.ga.uia.app.Pecuario;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="pecuario")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Pecuario implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="numReg" , length = 10)
	private String numReg;
	
    
	@Column(name="idSubregion" , length = 10)
	private String idSubregion;
	
	@Column(name="idMunicipio", length = 10)
	private String idMunicipio;
	
	@JsonProperty("Subregion")
	@Column(name="nameSubregion", length = 30)
	private String nameSubregion;
	
	@JsonProperty("Municipio")
	@Column(name="nameMunicipio", length = 60)
	private String nameMunicipio;
	
	
	@Column(name="idRubro", length = 10)
	private String idRubro;
	
	@JsonProperty("Rubro Pecuario")
	@Column(name="nameRubro", length = 60)
	private String nameRubro;
	
	@Column(name="idCategoria", length = 10)
	private String idCategoria;
	
	@JsonProperty("categoria")
	@Column(name="nameCategoria", length = 60)
	private String nameCategoria;
	
	@Column(name="Cantidad", length = 20)
	private String Cantidad;
	
	
	public Pecuario() {
		
	}

	public String getNumReg() {
		return numReg;
	}

	public String getIdSubregion() {
		return idSubregion;
	}

	public String getIdMunicipio() {
		return idMunicipio;
	}

	public String getNameSubregion() {
		return nameSubregion;
	}

	public String getNameMunicipio() {
		return nameMunicipio;
	}

	public String getIdRubro() {
		return idRubro;
	}

	public String getNameRubro() {
		return nameRubro;
	}

	public String getIdCategoria() {
		return idCategoria;
	}

	public String getNameCategoria() {
		return nameCategoria;
	}

	public String getCantidad() {
		return Cantidad;
	}

	
	public Pecuario(String numReg, String idSubregion, String idMunicipio, String nameSubregion, String nameMunicipio,
			String idRubro, String nameRubro, String idCategoria, String nameCategoria, String cantidad) {
		super();
		this.numReg = numReg;
		this.idSubregion = idSubregion;
		this.idMunicipio = idMunicipio;
		this.nameSubregion = nameSubregion;
		this.nameMunicipio = nameMunicipio;
		this.idRubro = idRubro;
		this.nameRubro = nameRubro;
		this.idCategoria = idCategoria;
		this.nameCategoria = nameCategoria;
		Cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Pecuario [numReg=" + numReg + ", idSubregion=" + idSubregion + ", idMunicipio=" + idMunicipio
				+ ", nameSubregion=" + nameSubregion + ", nameMunicipio=" + nameMunicipio + ", idRubro=" + idRubro
				+ ", nameRubro=" + nameRubro + ", idCategoria=" + idCategoria + ", nameCategoria=" + nameCategoria
				+ ", Cantidad=" + Cantidad + "]";
	}
	
	
	

}
