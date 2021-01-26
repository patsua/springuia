package com.ga.uia.app.Agrocadena.Lacteos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LacteosService {
	
	@Autowired
	private LacteosRepository lacteosRepository;
	
	public List<Lacteos> getJoinidLacteosAll(String id){
		List<Lacteos> lacteos = new ArrayList<>();
		lacteosRepository.getJoinidLacteosAll(id)
		.forEach(lacteos::add);
		return lacteos;
	}
	
	public List<Lacteos> getJoinidLacteosFecha(String id, String fecha){
		List<Lacteos> lacteos = new ArrayList<>();
		lacteosRepository.getJoinidLacteosFecha(id, fecha)
		.forEach(lacteos::add);
		return lacteos;
		
	}


}
