package com.ga.uia.app.Agrocadena.III_Envio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class III_EnvioController {
	
	@Autowired
	private III_EnvioService iii_EnvioService;
	
	@RequestMapping(method=RequestMethod.GET, value ="/agrocadena/iiienvio/{id}")
	public List<III_Envio> getAll_idCacao(@PathVariable String id){
		return iii_EnvioService.getJoinidIIIEnvioAll(id);
	}
	
	@RequestMapping(method=RequestMethod.GET, value ="agrocadena/iiienvio/{id}/fecha/{fecha}")
	public List<III_Envio> getAll_idCacaofecha(@PathVariable String id, @PathVariable String fecha){
		return iii_EnvioService.getJoinidIIIEnvioFecha(id, fecha);
	}
	

}
