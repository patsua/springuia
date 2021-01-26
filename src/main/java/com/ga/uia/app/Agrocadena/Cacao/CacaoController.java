package com.ga.uia.app.Agrocadena.Cacao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CacaoController {
	
	@Autowired
	private CacaoService cacaoService;
	
	@RequestMapping(method=RequestMethod.GET, value ="/agrocadena/cacao/{id}")
	public List<Cacao> getAll_idCacao(@PathVariable String id){
		return cacaoService.getJoinidCacaoAll(id);
	}
	
	@RequestMapping(method=RequestMethod.GET, value ="/agrocadena/cacao/{id}/fecha/{fecha}")
	public List<Cacao> getAll_idCacaofecha(@PathVariable String id, @PathVariable String fecha){
		return cacaoService.getJoinidCacaoFecha(id, fecha);
	}
	

}
