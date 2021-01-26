package com.ga.uia.app.Pecuario;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PecuarioService {
	
	@Autowired
	private PecuarioRepository pecuarioRepository;
	
	public List<Pecuario> getJoinSubregionRubro(String id, String rubro){
		List<Pecuario> pecuarios = new ArrayList<>();
		pecuarioRepository.getJoinSubRubro(id,rubro)
		.forEach(pecuarios::add);
		return pecuarios;
	}
	
	public List<Pecuario> getJoinSubregion(String id){
		List<Pecuario> pecuarios = new ArrayList<>();
		pecuarioRepository.getJoinSub(id)
		.forEach(pecuarios::add);
		return pecuarios;
	}
	public List<Pecuario> getJoinMunicipio(String id){
		List<Pecuario> pecuarios = new ArrayList<>();
		pecuarioRepository.getJoinMun(id)
		.forEach(pecuarios::add);
		return pecuarios;
	}
	
	public List<Pecuario> getJoinMunCat(String id, String cat){
		List<Pecuario> pecuarios = new ArrayList<>();
		pecuarioRepository.getJoinmuncat(id, cat)
		.forEach(pecuarios::add);
		return pecuarios;
	}
	
	

}
