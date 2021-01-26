package com.ga.uia.app.Producto;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;



@Entity
@Table(name="producto")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Producto implements Serializable{
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="numRegistro" , length = 10)
	private String numRegistro;
	
	public String getNumRegistro() {
		return numRegistro;
	}
	public void setNumRegistro(String numRegistro) {
		this.numRegistro = numRegistro;
	}

	@Column(name="idSubregion" , length = 10)
	private String idSubregion;
	
	@Column(name="idMunicipio", length = 10)
	private String idMunicipio;
	
	@Column(name="idProducto", length = 10)
	private String idProducto;
	
	@JsonProperty("Subregion")
	@Column(name="nameSubregion", length = 30)
	private String nameSubregion;
	
	@JsonProperty("Municipio")
	@Column(name="nameMunicipio", length = 60)
	private String nameMunicipio;
	
	@JsonProperty("Producto")
	@Column(name="nameProducto", length = 60)
	private String nameProducto;
	
	@JsonProperty("año")
	@Column(name="anio", length = 10)
	private String anio;
	
	@Column(name="tipoCultivo", length = 30)
	private String tipoCultivo;
	
	@JsonProperty("area total")
	@Column(name="areaTotal", length = 10)
	private String y1areaTotal;
	
	@JsonProperty("area produccion")
	@Column(name="areaPdccion", length = 10)
	private String y2areaPdccion;
	
	@JsonProperty("vol produccion")
	@Column(name="volProdccion", length = 10)
	private String y3volProdccion;
	
	@JsonProperty("empleo/ha")
	@Column(name="empleoha", length = 10)
	private String y4empleoha;
	
	@JsonProperty("empleo")
	@Column(name="empleo", length = 10)
	private String y5empleo;
	
	@JsonProperty("Expl agric")
	@Column(name="explAgric", length = 10)
	private String y6explAgric;
	
	
	public String getIdSubregion() {
		return idSubregion;
	}
	public void setIdSubregion(String idSubregion) {
		this.idSubregion = idSubregion;
	}
	public String getIdMunicipio() {
		return idMunicipio;
	}
	public void setIdMunicipio(String idMunicipio) {
		this.idMunicipio = idMunicipio;
	}
	public String getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}
	public String getNameSubregion() {
		return nameSubregion;
	}
	public void setNameSubregion(String nameSubregion) {
		this.nameSubregion = nameSubregion;
	}
	public String getNameMunicipio() {
		return nameMunicipio;
	}
	public void setNameMunicipio(String nameMunicipio) {
		this.nameMunicipio = nameMunicipio;
	}
	public String getNameProducto() {
		return nameProducto;
	}
	public void setNameProducto(String nameProducto) {
		this.nameProducto = nameProducto;
	}
	public String getAnio() {
		return anio;
	}
	public void setAnio(String anio) {
		this.anio = anio;
	}
	public String getTipoCultivo() {
		return tipoCultivo;
	}
	public void setTipoCultivo(String tipoCultivo) {
		this.tipoCultivo = tipoCultivo;
	}
	public String getY1areaTotal() {
		return y1areaTotal;
	}
	public void setY1areaTotal(String y1areaTotal) {
		this.y1areaTotal = y1areaTotal;
	}
	public String getY2areaPdccion() {
		return y2areaPdccion;
	}
	public void setY2areaPdccion(String y2areaPdccion) {
		this.y2areaPdccion = y2areaPdccion;
	}
	public String getY3volProdccion() {
		return y3volProdccion;
	}
	public void setY3volProdccion(String y3volProdccion) {
		this.y3volProdccion = y3volProdccion;
	}
	public String getY4empleoha() {
		return y4empleoha;
	}
	public void setY4empleoha(String y4empleoha) {
		this.y4empleoha = y4empleoha;
	}
	public String getY5empleo() {
		return y5empleo;
	}
	public void setY5empleo(String y5empleo) {
		this.y5empleo = y5empleo;
	}
	public String getY6explAgric() {
		return y6explAgric;
	}
	public void setY6explAgric(String y6explAgric) {
		this.y6explAgric = y6explAgric;
	}
	public Producto() {
		
	}
	
	
	public Producto(String numRegistro, String idSubregion, String idMunicipio, String idProducto, String nameSubregion,
			String nameMunicipio, String nameProducto, String anio, String tipoCultivo, String y1areaTotal,
			String y2areaPdccion, String y3volProdccion, String y4empleoha, String y5empleo, String y6explAgric) {
		super();
		this.numRegistro = numRegistro;
		this.idSubregion = idSubregion;
		this.idMunicipio = idMunicipio;
		this.idProducto = idProducto;
		this.nameSubregion = nameSubregion;
		this.nameMunicipio = nameMunicipio;
		this.nameProducto = nameProducto;
		this.anio = anio;
		this.tipoCultivo = tipoCultivo;
		this.y1areaTotal = y1areaTotal;
		this.y2areaPdccion = y2areaPdccion;
		this.y3volProdccion = y3volProdccion;
		this.y4empleoha = y4empleoha;
		this.y5empleo = y5empleo;
		this.y6explAgric = y6explAgric;
	}
	@Override
	public String toString() {
		return "Producto [numRegistro=" + numRegistro + ", idSubregion=" + idSubregion + ", idMunicipio=" + idMunicipio
				+ ", idProducto=" + idProducto + ", nameSubregion=" + nameSubregion + ", nameMunicipio=" + nameMunicipio
				+ ", nameProducto=" + nameProducto + ", anio=" + anio + ", tipoCultivo=" + tipoCultivo
				+ ", y1areaTotal=" + y1areaTotal + ", y2areaPdccion=" + y2areaPdccion + ", y3volProdccion="
				+ y3volProdccion + ", y4empleoha=" + y4empleoha + ", y5empleo=" + y5empleo + ", y6explAgric="
				+ y6explAgric + "]";
	}
	
	
	

}
