package com.ga.uia.app.Agrocadena.IVCR_Envio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IVCR_EnvioService {
	
	@Autowired
	private IVCR_EnvioRepository ivcr_EnvioRepository;
	
	public List<IVCR_Envio> getJoinidIVCREnvioAll(String id){
		List<IVCR_Envio> ivcrs = new ArrayList<>();
		ivcr_EnvioRepository.getJoinidIVCREnvioAll(id)
		.forEach(ivcrs::add);
		return ivcrs;
	}
	
	public List<IVCR_Envio> getJoinidIVCREnvioFecha(String id, String fecha){
		List<IVCR_Envio> ivcrs = new ArrayList<>();
		ivcr_EnvioRepository.getJoinidIVCREnvioFecha(id, fecha)
		.forEach(ivcrs::add);
		return ivcrs;
		
	}

}
