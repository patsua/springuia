package com.ga.uia.app.Modelaciones.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ga.uia.app.Modelaciones.DTO.TransporteDTO;
import com.ga.uia.app.Modelaciones.Mapper.TransporteMapper;
import com.ga.uia.app.Modelaciones.Model.Transporte;
import com.ga.uia.app.Modelaciones.Services.TransporteService;

import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@RestController

public class TransporteController {
	@Autowired
	private TransporteService transporteService;
   
	private  TransporteMapper transporteMapper;
    
    
    
	@RequestMapping(method=RequestMethod.GET, value ="/transporte/{id}/{tc}/{tu}")
	public List<Transporte> getAll_idTransporte(@PathVariable String id,@PathVariable String tc,@PathVariable String tu){
		return transporteService.getJoinidTransporteCosto(id,tc,tu);
	}
	
	@RequestMapping(method=RequestMethod.GET, value ="/transporte/municipio/{id}")
	public List<Transporte> getAll_idTransporte(@PathVariable String id){
		return transporteService.getJoinidTransporteAll(id);
	}
	
	@RequestMapping(method=RequestMethod.GET, value ="/transporte")
	public List<Transporte> getAll_idTransporte(){
		return transporteService.getJoinidTransporteAlla();
	}
	
	
	

}
