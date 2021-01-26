package com.ga.uia.app.Agrocadena.III_Envio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="iiienvio")
@JsonIgnoreProperties(ignoreUnknown = true)
public class III_Envio implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="numReg" , length = 10)
	private String NumReg;
	
	@JsonProperty("Indice-iiienvio")
	@Column(name="precio" , length = 15)
	private String precio;
	
	@Column(name="fecha" , length = 20)
	private String fecha;
	
	@Column(name="id_iiienvio" , length = 20)
	private String id_iiienvio;
	
	public String getNumReg() {
		return NumReg;
	}

	public void setNumReg(String numReg) {
		NumReg = numReg;
	}

	public String getId_iiienvio() {
		return id_iiienvio;
	}

	public void setId_iiienvio(String id_iiienvio) {
		this.id_iiienvio = id_iiienvio;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


}
