package com.ga.uia.app.Agrocadena.Indicadores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class IndicadoresController {
	
	@Autowired
	private IndicadoresService indicadoresService;
	
	@RequestMapping(method=RequestMethod.GET, value ="/indicadores/agrocadena/{id}")
	public List<Indicadores> getAll_idIndicadores(@PathVariable String id){
		return indicadoresService.getJoinidIndicadores(id);
	}
    
	@RequestMapping(method=RequestMethod.GET, value ="/indicadores/agrocadena/{id}/indicador/{indi}")
	public List<Indicadores> getAll_idindiIndicadores(@PathVariable String id, @PathVariable String indi){
		return indicadoresService.getJoinidIndicadoresAll(id, indi);
	}
}
