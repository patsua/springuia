package com.ga.uia.app.Indicadores.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ga.uia.app.Indicadores.Model.PreciosTierra;
import com.ga.uia.app.Indicadores.Repository.PreciosTierraRepository;


@Service
public class PreciosTierraService {
	@Autowired
	private PreciosTierraRepository preciosTierraRepository;
	
	public List<PreciosTierra> getJoinidPreciosTierra(String idsub){
		List<PreciosTierra> tierras = new ArrayList<>();
		preciosTierraRepository.getJoinidPreciosTierra(idsub)
		.forEach(tierras::add);
		return tierras;
	}

}
