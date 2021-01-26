package com.ga.uia.app.Agrocadena.Carnes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarnesService {
	

	@Autowired
	private CarnesRepository carnesRepository;
	
	public List<Carnes> getJoinidCarnesAll(String id){
		List<Carnes> carnes = new ArrayList<>();
		carnesRepository.getJoinidCarnesAll(id)
		.forEach(carnes::add);
		return carnes;
	}
	
	public List<Carnes> getJoinidCarnesFecha(String id, String fecha){
		List<Carnes> carnes = new ArrayList<>();
		carnesRepository.getJoinidCarnesFecha(id, fecha)
		.forEach(carnes::add);
		return carnes;
		
	}

}
