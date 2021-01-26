package com.ga.uia.app.Modelaciones.Services;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ga.uia.app.Modelaciones.Model.Transporte;
import com.ga.uia.app.Modelaciones.Repository.TransporteRepositoy;



@Service
public class TransporteService {
	
	@Autowired
	private  TransporteRepositoy transporteRepository;
	
	
	
	public List <Transporte> getJoinidTransporteCosto(String id, String tc, String tu){
		List<Transporte> transportes = new ArrayList<>();
		transporteRepository.getJoinidTransporteCosto(id,tc,tu)
		.forEach(transportes::add);
		return transportes;	
	
		
	}
	
	public List <Transporte> getJoinidTransporteAll(String id){
		List<Transporte> transportes = new ArrayList<>();
		transporteRepository.getJoinidTransporteAll(id)
		.forEach(transportes::add);
		return transportes;
			
	}
	
	public List <Transporte> getJoinidTransporteAlla(){
		List<Transporte> transportes = new ArrayList<>();
		transporteRepository.getJoinidTransporteAlla()
		.forEach(transportes::add);
		return transportes;

}
	
	
}
