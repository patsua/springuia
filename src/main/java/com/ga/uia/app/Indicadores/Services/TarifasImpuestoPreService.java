package com.ga.uia.app.Indicadores.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ga.uia.app.Indicadores.Model.TarifasImpuestoPre;
import com.ga.uia.app.Indicadores.Repository.TarifasImpuestoPreRepository;


@Service
public class TarifasImpuestoPreService {
	@Autowired
	private TarifasImpuestoPreRepository tarifasImpuestoPreRepository;
	
	public List<TarifasImpuestoPre> getJoinidTarifasImpuestoPreAll(String idsub){
		List<TarifasImpuestoPre> impuestos = new ArrayList<>();
		tarifasImpuestoPreRepository.getJoinidTarifasImpuestoPreAll(idsub)
		.forEach(impuestos::add);
		return impuestos;
	}

}
