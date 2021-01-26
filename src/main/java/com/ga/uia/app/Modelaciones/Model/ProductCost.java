package com.ga.uia.app.Modelaciones.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "productcost")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCost implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="idproduct" , length = 30)
	private String idProduct;
	
	@Column(name="idagro" , length = 20)
	private String idagro;
	

	@Column(name="nameproduct" , length = 50)
	private String nameproduct;
	
	@Column(name="costo" , length = 30)
	private String costo;
	
	@Column(name="precio" , length = 30)
	private String precio;
	
	public String getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(String idProduct) {
		this.idProduct = idProduct;
	}

	public String getIdagro() {
		return idagro;
	}

	public void setIdagro(String idagro) {
		this.idagro = idagro;
	}

	public String getNameproduct() {
		return nameproduct;
	}

	public void setNameproduct(String nameproduct) {
		this.nameproduct = nameproduct;
	}

	public String getCosto() {
		return costo;
	}

	public void setCosto(String costo) {
		this.costo = costo;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	

}
