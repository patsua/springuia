package com.ga.uia.app.Agrocadena.ICC_Envio;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class IccEnvioService {
	
	@Autowired
	private IccEnvioRepository iccEnvioRepository;
	
	public List<IccEnvio> getJoinidIccEnvioAll(String id){
		List<IccEnvio> iccs = new ArrayList<>();
		iccEnvioRepository.getJoinidIccEnvioAll(id)
		.forEach(iccs::add);
		return iccs;
	}
	
	public List<IccEnvio> getJoinidIccEnvioFecha(String id, String fecha){
		List<IccEnvio> iccs = new ArrayList<>();
		iccEnvioRepository.getJoinidIccEnvioFecha(id, fecha)
		.forEach(iccs::add);
		return iccs;
		
	}

}
