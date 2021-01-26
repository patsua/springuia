package com.ga.uia.app.Indicadores.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ga.uia.app.Indicadores.Model.Censo;
import com.ga.uia.app.Indicadores.Services.CensoService;

@RestController
public class CensoController {
	
	@Autowired
	private CensoService censoService;
	
	@RequestMapping(method = RequestMethod.GET, value="/mercado/censo/{idsub},{idmun},{ind}")
	public List<Censo> getCensoAlla(@PathVariable String idsub, @PathVariable String idmun, @PathVariable String ind){
		return censoService.getJoinAll(idsub, idmun, ind) ;
		
	}
   
}
