package com.ga.uia.app.Agrocadena.Cacao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CacaoService {
	
	@Autowired
	private CacaoRepository cacaoRepository;
	
	public List<Cacao> getJoinidCacaoAll(String id){
		List<Cacao> cacaos = new ArrayList<>();
		cacaoRepository.getJoinidCacaoAll(id)
		.forEach(cacaos::add);
		return cacaos;
	}
	
	public List<Cacao> getJoinidCacaoFecha(String id, String fecha){
		List<Cacao> cacaos = new ArrayList<>();
		cacaoRepository.getJoinidCacaoFecha(id, fecha)
		.forEach(cacaos::add);
		return cacaos;
		
	}

}
