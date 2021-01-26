package com.ga.uia.app.Agrocadena.VerHor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ga.uia.app.Agrocadena.Cacao.Cacao;
import com.ga.uia.app.Agrocadena.Cacao.CacaoService;

@RestController
public class VerHorController {
	
	@Autowired
	private VerHorService verHorService;
	
	@RequestMapping(method=RequestMethod.GET, value ="/agrocadena/hortalizas/{id}")
	public List<VerHor> getAll_idVerHor(@PathVariable String id){
		return verHorService.getJoinidVerHorAll(id);
	}
	
	@RequestMapping(method=RequestMethod.GET, value ="agrocadena/hortalizas/{id}/fecha/{fecha}")
	public List<VerHor> getAll_idVerHorfecha(@PathVariable String id, @PathVariable String fecha){
		return verHorService.getJoinidVerHorFecha(id, fecha);
	}
	


}
