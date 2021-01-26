package com.ga.uia.app.Indicadores.Model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "nivel2indicador")
public class Nivel2Indicador implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String namenivel2;
	@Column(length = 15)
	private String idSubre;
	@Column(length = 15)
	private String idmun;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNamenivel2() {
		return namenivel2;
	}

	public void setNamenivel2(String namenivel2) {
		this.namenivel2 = namenivel2;
	}
	
	
	public String getIdSubre() {
		return idSubre;
	}

	public void setIdSubre(String idSubre) {
		this.idSubre = idSubre;
	}

	public String getIdmun() {
		return idmun;
	}

	public void setIdmun(String idmun) {
		this.idmun = idmun;
	}

	
	
	public Nivel2Indicador() {
		
	}

	
	
}
