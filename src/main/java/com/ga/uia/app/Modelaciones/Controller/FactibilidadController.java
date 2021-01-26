package com.ga.uia.app.Modelaciones.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ga.uia.app.Modelaciones.Model.Factibilidad;
import com.ga.uia.app.Modelaciones.Services.FactibilidadService;



@RestController
@RequestMapping("/factible")
public class FactibilidadController {
    @Autowired
	private FactibilidadService factibilidadService;
    
    @RequestMapping(method=RequestMethod.GET, value ="/{idm}/{idp}")
	public List<Factibilidad> getAll_idAgrocadena(@PathVariable String idm, @PathVariable String idp ){
		return factibilidadService.getJoinidFactibilidad(idm,idp);
	}
	

}
