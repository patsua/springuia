package com.ga.uia.app.mercado.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ga.uia.app.mercado.Model.Agrocadena;
import com.ga.uia.app.mercado.Services.AgrocadenaService;
@RestController
public class AgrocadenaController {
	
	@Autowired
	private AgrocadenaService agrocadenaService;
	
	@RequestMapping(method=RequestMethod.GET, value ="/agrocadena/{id}/indicador/{indi}")
	public List<Agrocadena> getAll_idAgrocadena(@PathVariable String id, @PathVariable String indi ){
		return agrocadenaService.getJoinidAgrocadenaAllT(id,indi);
	}
	
	@RequestMapping(method=RequestMethod.GET, value ="/agrocadena/{id}/indicador/{indi}/{var}")
	public List<Agrocadena> getAll_idAgrocadena(@PathVariable String id, @PathVariable String indi, @PathVariable String var ){
		return agrocadenaService.getJoinidAgrocadenaAll(id,indi,var);
	}
	
	@RequestMapping(method=RequestMethod.GET, value ="/agrocadena/{id}/indicador/{indi}/{var}/fecha/{fecha1}/{fecha2}")
	public List<Agrocadena> getAll_idAgrocadenafecha(@PathVariable String id, @PathVariable String indi,@PathVariable String var,@PathVariable String fecha1, @PathVariable  String fecha2){
		return agrocadenaService.getJoinidAgrocadenaFecha(id, indi,var,fecha1, fecha2);
	}
	

}