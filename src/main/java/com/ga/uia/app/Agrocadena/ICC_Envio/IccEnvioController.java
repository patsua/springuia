package com.ga.uia.app.Agrocadena.ICC_Envio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IccEnvioController {
	
	@Autowired
	private IccEnvioService iccEnvioService;
	
	@RequestMapping(method=RequestMethod.GET, value ="/agrocadena/iccenvio/{id}")
	public List<IccEnvio> getAll_idIccEnvio(@PathVariable String id){
		return iccEnvioService.getJoinidIccEnvioAll(id);
	}
	
	@RequestMapping(method=RequestMethod.GET, value ="agrocadena/iccenvio/{id}/fecha/{fecha}")
	public List<IccEnvio> getAll_idIccEnviofecha(@PathVariable String id, @PathVariable String fecha){
		return iccEnvioService.getJoinidIccEnvioFecha(id, fecha);
	}
	

}
