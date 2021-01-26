package com.ga.uia.app.Agrocadena.Indicadores;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndicadoresService {
	
	@Autowired
	private IndicadoresRepository indicadoresRepository;
	
	public List<Indicadores> getJoinidIndicadores(String id){
		List<Indicadores> indicador = new ArrayList<>();
		indicadoresRepository.getJoinidIndicadores(id)
		.forEach(indicador::add);
		return indicador;
	}
	
	 public List <Indicadores> getJoinidIndicadoresAll(String id, String indi){
		 List<Indicadores> indicador = new ArrayList<>();
			indicadoresRepository.getJoinidIndicadoresAll(id,indi)
			.forEach(indicador::add);
			return indicador;
	 }
	


}
