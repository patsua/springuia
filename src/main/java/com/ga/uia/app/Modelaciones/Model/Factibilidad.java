package com.ga.uia.app.Modelaciones.Model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "factibilidad")
public class Factibilidad implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	@Column(length = 30)
	private String codmun;
	@Column(length = 50)
	private String codprod;
	@Column(length = 50)
	private String a1;
	@Column(length = 50)
	private String a2;
	@Column(length = 50)
	private String a3;
	@Column(length = 50)
	private String total;
		
	
	public Factibilidad() {
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCodmun() {
		return codmun;
	}


	public void setCodmun(String codmun) {
		this.codmun = codmun;
	}


	public String getCodprod() {
		return codprod;
	}


	public void setCodprod(String codprod) {
		this.codprod = codprod;
	}


	public String getA1() {
		return a1;
	}


	public void setA1(String a1) {
		this.a1 = a1;
	}


	public String getA2() {
		return a2;
	}


	public void setA2(String a2) {
		this.a2 = a2;
	}


	public String getA3() {
		return a3;
	}


	public void setA3(String a3) {
		this.a3 = a3;
	}


	public String getTotal() {
		return total;
	}


	public void setTotal(String total) {
		this.total = total;
	}



	public Factibilidad(Long id, String codmun, String codprod, String a1, String a2, String a3, String total
			) {
		super();
		this.id = id;
		this.codmun = codmun;
		this.codprod = codprod;
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
		this.total = total;
	
	}
	
	
	

}
