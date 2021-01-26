package com.ga.uia.app.Agrocadena.IVCR_Envio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IVCR_EnvioController {
	
	@Autowired
	private IVCR_EnvioService ivcr_EnvioService;
	
	@RequestMapping(method=RequestMethod.GET, value ="/agrocadena/ivcrenvio/{id}")
	public List<IVCR_Envio> getAll_idIVCREnvio(@PathVariable String id){
		return ivcr_EnvioService.getJoinidIVCREnvioAll(id);
	}
	
	@RequestMapping(method=RequestMethod.GET, value ="agrocadena/ivcrenvio/{id}/fecha/{fecha}")
	public List<IVCR_Envio> getAll_idCacaofecha(@PathVariable String id, @PathVariable String fecha){
		return ivcr_EnvioService.getJoinidIVCREnvioFecha(id, fecha);
	}
	

}
