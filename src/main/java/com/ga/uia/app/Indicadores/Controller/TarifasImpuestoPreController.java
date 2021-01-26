package com.ga.uia.app.Indicadores.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ga.uia.app.Indicadores.Model.TarifasImpuestoPre;
import com.ga.uia.app.Indicadores.Services.TarifasImpuestoPreService;

@RestController
public class TarifasImpuestoPreController {
	@Autowired
	private TarifasImpuestoPreService tarifasImpuestoPreService;
	
	@RequestMapping(method= RequestMethod.GET, value="/mercado/tarifaspredial/{idsub}")
	public List<TarifasImpuestoPre> getTarifas(@PathVariable String idsub){
		return tarifasImpuestoPreService.getJoinidTarifasImpuestoPreAll(idsub);
		
	}

}
