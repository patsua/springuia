package com.ga.uia.app.Indicadores.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "preciostierra")
public class PreciosTierra implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column (length = 50)
	private String idmun;
	@Column (length = 10)
	private String idsub;
	@Column (length = 50)
	private String namemun;
	@Column (length = 50)
	private String rango;
	@Column (length = 50)
	private String area;
	@Column (length = 50)
	private String porcentaje;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRango() {
		return rango;
	}
	public void setRango(String rango) {
		this.rango = rango;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getPorcentaje() {
		return porcentaje;
	}
	public void setPorcentaje(String porcentaje) {
		this.porcentaje = porcentaje;
	}
	public String getIdmun() {
		return idmun;
	}
	public void setIdmun(String idmun) {
		this.idmun = idmun;
	}
	public String getNamemun() {
		return namemun;
	}
	public void setNamemun(String namemun) {
		this.namemun = namemun;
	}
	public String getIdsub() {
		return idsub;
	}
	public void setIdsub(String idsub) {
		this.idsub = idsub;
	}
	
	
	
	

}
