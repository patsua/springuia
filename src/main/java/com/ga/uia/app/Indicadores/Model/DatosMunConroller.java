package com.ga.uia.app.Indicadores.Model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ga.uia.app.Indicadores.Services.DatosMunService;

@RestController
public class DatosMunConroller {
	
	@Autowired
	private DatosMunService datosMunService;
	
	@RequestMapping(method = RequestMethod.GET, value="/mercado/datosmun/{idsub}")
	public List<DatosMun> getDatosAll(@PathVariable String idsub){
		return  datosMunService.getJoinAll(idsub);
	}

}
