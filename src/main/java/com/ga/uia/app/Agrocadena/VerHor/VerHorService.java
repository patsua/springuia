package com.ga.uia.app.Agrocadena.VerHor;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class VerHorService {
	
	@Autowired
	private VerHorRepository verHorRepository;
	
	public List<VerHor> getJoinidVerHorAll(String id){
		List<VerHor> verhor = new ArrayList<>();
		verHorRepository.getJoinidVerHorAll(id)
		.forEach(verhor::add);
		return verhor;
	}
	
	public List<VerHor> getJoinidVerHorFecha(String id, String fecha){
		List<VerHor> verhor = new ArrayList<>();
		verHorRepository.getJoinidVerHorFecha(id, fecha)
		.forEach(verhor::add);
		return verhor;
		
	}

}
