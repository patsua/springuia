package com.ga.uia.app.Modelaciones.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ga.uia.app.Modelaciones.Model.Factibilidad;
import com.ga.uia.app.Modelaciones.Repository.FactibilidadRepository;


@Service
public class FactibilidadService {
	
	@Autowired
	private FactibilidadRepository factibilidadRepository;
	
	public List<Factibilidad> getJoinidFactibilidad(String idm, String idp){
		List<Factibilidad> factibles = new ArrayList<>();
		factibilidadRepository.getJoinidFactibilidad(idm,idp)
		.forEach(factibles::add);
		return factibles;
	}

}
