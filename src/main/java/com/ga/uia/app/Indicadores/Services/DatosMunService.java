package com.ga.uia.app.Indicadores.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ga.uia.app.Indicadores.Model.DatosMun;
import com.ga.uia.app.Indicadores.Repository.DatosMunRepository;

@Service
public class DatosMunService {
	@Autowired
	private DatosMunRepository datosMunRepository;
	public List <DatosMun> getJoinAll(String idsub){
		List<DatosMun> datos = new ArrayList<>();
		datosMunRepository.getJoinAll(idsub)
		.forEach(datos ::add);
		return datos;
	}

}
