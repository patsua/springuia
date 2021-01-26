package com.ga.uia.app.Indicadores.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
@Table(name = "censo")
public class Censo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;
	
	@Column(length = 10)
	private String idsub;
	@Column(length = 15)
	private String idmun;
	

    private String indicador;
	@Column(length = 15)
    private String idvariable;
	private String namevariable;
	@Column(length = 40)
	private String Valor;
	
		
	public String getIdvariable() {
		return idvariable;
	}
	public void setIdvariable(String idvariable) {
		this.idvariable = idvariable;
	}
	public String getNamevariable() {
		return namevariable;
	}
	public void setNamevariable(String namevariable) {
		this.namevariable = namevariable;
	}
	public String getValor() {
		return Valor;
	}
	public void setValor(String valor) {
		Valor = valor;
	}
	
	public String getIdmun() {
		return idmun;
	}
	public void setIdmun(String idmun) {
		this.idmun = idmun;
	}
	
	
	public String getIndicador() {
		return indicador;
	}
	public void setIndicador(String indicador) {
		this.indicador = indicador;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getIdsub() {
		return idsub;
	}
	public void setIdsub(String idsub) {
		this.idsub = idsub;
	}
	public Censo() {
		
	}
	
	
}
