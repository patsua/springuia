package com.ga.uia.app.Pecuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class PecuarioController {
	
	@Autowired
	private PecuarioService pecuarioService;
	
	@RequestMapping(method=RequestMethod.GET, value="evas/subregiones/{id}/pecuarios/{rubro}")
	public List<Pecuario> getAllPecuarioSub(@PathVariable String id, @PathVariable String rubro){
		return pecuarioService.getJoinSubregionRubro(id, rubro);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="evas/subregiones/{id}/pecuarios")
	public List<Pecuario> getAllPecuarioSub(@PathVariable String id){
		return pecuarioService.getJoinSubregion(id);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="evas/municipios/{id}/pecuarios")
	public List<Pecuario> getAllPecuarioMun(@PathVariable String id){
		return pecuarioService.getJoinMunicipio(id);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="evas/municipios/{id}/pecuarios/{cat}")
	public List<Pecuario> getAllPecuarioMuncat(@PathVariable String id,@PathVariable String cat ){
		return pecuarioService.getJoinMunCat(id, cat);
	}

}
