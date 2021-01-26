package com.ga.uia.app.Indicadores.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tarifasimpuestopre")
public class TarifasImpuestoPre implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(length =50)
	private String idmun;
	@Column(length =50)
	private String namemun;
	@Column(length =10)
	private String idsub;
	@Column(length =50)
	private String promedio_urbana;
	@Column(length =50)
	private String promedio_rural;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getPromedio_urbana() {
		return promedio_urbana;
	}
	public void setPromedio_urbana(String promedio_urbana) {
		this.promedio_urbana = promedio_urbana;
	}
	public String getPromedio_rural() {
		return promedio_rural;
	}
	public void setPromedio_rural(String promedio_rural) {
		this.promedio_rural = promedio_rural;
	}
	public String getIdsub() {
		return idsub;
	}
	public void setIdsub(String idsub) {
		this.idsub = idsub;
	}
	
	

}
