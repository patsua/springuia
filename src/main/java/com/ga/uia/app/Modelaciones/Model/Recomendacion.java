package com.ga.uia.app.Modelaciones.Model;

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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "recomendacion")
public class Recomendacion implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@Column(length = 1000)
	private String condiciones;
	@Column(length = 1000)
	private String requerimientos;
	@Column(length = 800)
	private String altura;
	@Column(length = 800)	
	private String clima;
	@Column(length = 800)
	private String ciclo;
	@Column(length = 800)
	private String rendimiento;
	@Column(length = 800)
	private String componentes;
	@Column(length = 800)
	private String cultivos;
	@Column(length = 1000)
	private String usos;
	@Column(length = 500)
	private String derivados;
	
	@OneToMany(mappedBy = "recomendacion", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<Productom> productosms = new HashSet<>();
	
	public Recomendacion() {
		
	}
	
	

	public Recomendacion(String condiciones, String requerimientos, String altura, String clima, String ciclo,
			String rendimiento, String componentes, String cultivos, String usos, String derivados) {
		super();
		this.condiciones = condiciones;
		this.requerimientos = requerimientos;
		this.altura = altura;
		this.clima = clima;
		this.ciclo = ciclo;
		this.rendimiento = rendimiento;
		this.componentes = componentes;
		this.cultivos = cultivos;
		this.usos = usos;
		this.derivados = derivados;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCondiciones() {
		return condiciones;
	}

	public void setCondiciones(String condiciones) {
		this.condiciones = condiciones;
	}

	public String getRequerimientos() {
		return requerimientos;
	}

	public void setRequerimientos(String requerimientos) {
		this.requerimientos = requerimientos;
	}

	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}

	public String getClima() {
		return clima;
	}

	public void setClima(String clima) {
		this.clima = clima;
	}

	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

	public String getRendimiento() {
		return rendimiento;
	}

	public void setRendimiento(String rendimiento) {
		this.rendimiento = rendimiento;
	}

	public String getComponentes() {
		return componentes;
	}

	public void setComponentes(String componentes) {
		this.componentes = componentes;
	}

	public String getCultivos() {
		return cultivos;
	}

	public void setCultivos(String cultivos) {
		this.cultivos = cultivos;
	}

	public String getUsos() {
		return usos;
	}

	public void setUsos(String usos) {
		this.usos = usos;
	}
	

	public String getDerivados() {
		return derivados;
	}



	public void setDerivados(String derivados) {
		this.derivados = derivados;
	}



	public Set<Productom> getProductosms() {
		return productosms;
	}

	public void setProductosms(Set<Productom> productosms) {
		this.productosms = productosms;
		
		for(Productom p: productosms) {
			p.setRecomendacion(this);
		}
		
		
	}
	
	

}
