package com.ga.uia.app.Indicadores.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ga.uia.app.Indicadores.Model.Censo;
import com.ga.uia.app.Indicadores.Repository.CensoRepository;


@Service
public class CensoService {
	
	@Autowired
	private CensoRepository censoRepository;
	public List <Censo> getJoinAll(String idsub, String idmun, String ind){
		List<Censo> datos = new ArrayList<>();
		censoRepository.getJoinCenso(idsub,idmun,ind)
		.forEach(datos ::add);
		return datos;
	}
}
