package com.ga.uia.app.Indicadores.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ga.uia.app.Indicadores.Model.PreciosTierra;
import com.ga.uia.app.Indicadores.Services.PreciosTierraService;

@RestController
public class PreciosTierraController {
	
	@Autowired
	private PreciosTierraService preciosTierraService;
	
	@RequestMapping(method= RequestMethod.GET, value ="/mercado/preciotierra/{idsub}")
	public List<PreciosTierra> getPreciosTierraAll(@PathVariable String idsub){
		return preciosTierraService.getJoinidPreciosTierra(idsub);
		
		
	}

	
}
