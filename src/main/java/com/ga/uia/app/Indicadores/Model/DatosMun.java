package com.ga.uia.app.Indicadores.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class DatosMun implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(length =10) 
	private String idSub;
	@Column(length =10) 
	private String idmun;
	@Column(length =30) 
	private String namemun;
	@Column(length =20) 
	private String areamun;
	@Column(length =20) 
	private String habitrural;
	@Column(length =20) 
	private String gini;
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
	
	public String getHabitrural() {
		return habitrural;
	}
	public void setHabitrural(String habitrural) {
		this.habitrural = habitrural;
	}
	public String getGini() {
		return gini;
	}
	public void setGini(String gini) {
		this.gini = gini;
	}
	public String getAreamun() {
		return areamun;
	}
	public void setAreamun(String areamun) {
		this.areamun = areamun;
	}
	public String getIdSub() {
		return idSub;
	}
	public void setIdSub(String idSub) {
		this.idSub = idSub;
	}
	
	
	
	

}
