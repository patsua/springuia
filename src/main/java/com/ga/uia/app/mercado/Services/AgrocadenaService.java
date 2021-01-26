package com.ga.uia.app.mercado.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ga.uia.app.mercado.Model.Agrocadena;
import com.ga.uia.app.mercado.Repository.AgrocadenaRepository;

@Service
public class AgrocadenaService {
	
	@Autowired
	private AgrocadenaRepository agrocadenaRepository;
	
	public List<Agrocadena> getJoinidAgrocadenaAllT(String id, String indi){
		List<Agrocadena> agrocadenas = new ArrayList<>();
		agrocadenaRepository.getJoinidAgrocadenaAllT(id,indi)
		.forEach(agrocadenas::add);
		return agrocadenas;
	}
	
	public List<Agrocadena> getJoinidAgrocadenaAll(String id, String indi, String var){
		List<Agrocadena> agrocadenas = new ArrayList<>();
		agrocadenaRepository.getJoinidAgrocadenaAll(id,indi,var)
		.forEach(agrocadenas::add);
		return agrocadenas;
	}
	
	public List<Agrocadena> getJoinidAgrocadenaFecha(String id, String indi,String var,String fecha1,String fecha2){
		List<Agrocadena> agrocadenas = new ArrayList<>();
		agrocadenaRepository.getJoinidAgrocadenaFecha(id,indi,var, fecha1,fecha2)
		.forEach(agrocadenas::add);
		return agrocadenas;

}
}
