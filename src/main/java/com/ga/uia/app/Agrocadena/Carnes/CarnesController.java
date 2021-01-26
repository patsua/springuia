package com.ga.uia.app.Agrocadena.Carnes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarnesController {
	
	@Autowired
	private CarnesService carnesService;
	
	@RequestMapping(method=RequestMethod.GET, value ="/agrocadena/carnes/{id}")
	public List<Carnes> getAll_idCarnes(@PathVariable String id){
		return carnesService.getJoinidCarnesAll(id);
	}
	
	@RequestMapping(method=RequestMethod.GET, value ="agrocadena/carnes/{id}/fecha/{fecha}")
	public List<Carnes> getAll_idCarnesfecha(@PathVariable String id, @PathVariable String fecha){
		return carnesService.getJoinidCarnesFecha(id, fecha);
	}
	


}
