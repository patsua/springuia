package com.ga.uia.app.Agrocadena.Lacteos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LacteosController {
	
	@Autowired
	private LacteosService lacteosService;
	
	@RequestMapping(method=RequestMethod.GET, value ="/agrocadena/lacteos/{id}")
	public List<Lacteos> getAll_idCacao(@PathVariable String id){
		return lacteosService.getJoinidLacteosAll(id);
	}
	
	@RequestMapping(method=RequestMethod.GET, value ="agrocadena/lacteos/{id}/fecha/{fecha}")
	public List<Lacteos> getAll_idLacteosfecha(@PathVariable String id, @PathVariable String fecha){
		return lacteosService.getJoinidLacteosFecha(id, fecha);
	}

}
