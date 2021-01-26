package com.ga.uia.app.Modelaciones.DTO;

import java.io.Serializable;

public class TransporteDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long costo;

	public Long getCosto() {
		return costo;
	}

	public void setCosto(Long costo) {
		this.costo = costo;
	}

	public TransporteDTO(Long costo) {
		super();
		this.costo = costo;
	}
	
	public TransporteDTO() {
		
	}

	@Override
	public String toString() {
		return "TransporteDTO [costo=" + costo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((costo == null) ? 0 : costo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TransporteDTO other = (TransporteDTO) obj;
		if (costo == null) {
			if (other.costo != null)
				return false;
		} else if (!costo.equals(other.costo))
			return false;
		return true;
	}
	
	

}
