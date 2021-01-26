package com.ga.uia.app.Agrocadena.III_Envio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class III_EnvioService {
	
	@Autowired
	private III_EnvioRepository iii_EnvioRepository;
	
	public List<III_Envio> getJoinidIIIEnvioAll(String id){
		List<III_Envio> envios = new ArrayList<>();
		iii_EnvioRepository.getJoinIIIEnvioAll(id)
		.forEach(envios::add);
		return envios;
	}
	
	public List<III_Envio> getJoinidIIIEnvioFecha(String id, String fecha){
		List<III_Envio> envios = new ArrayList<>();
		iii_EnvioRepository.getJoinidIIIEnvioFecha(id, fecha)
		.forEach(envios::add);
		return envios;
		
	}

}
