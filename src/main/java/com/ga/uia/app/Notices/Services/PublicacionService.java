package com.ga.uia.app.Notices.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ga.uia.app.Notices.Model.Publicacion;
import com.ga.uia.app.Notices.Repository.PubicacionRepository;

@Service
public class PublicacionService {
	@Autowired
    private PubicacionRepository publicacionRepository; 
	
	public List<Publicacion> findByPublished(boolean published){
		List<Publicacion> publicaciones = new ArrayList<>();
		publicacionRepository.findAll()
		.forEach(publicaciones::add);
		return publicaciones;
	}
	 public List<Publicacion> findByTitleContaining(String title){
		List<Publicacion> publicaciones = new ArrayList<>();
		if (title == null)
			
			publicacionRepository.findAll().forEach(publicaciones::add);
		else
			publicacionRepository.findByTitleContaining(title)
			.forEach(publicaciones::add);
		return publicaciones;	 
	 }
	 public void addPublicacion(Publicacion publicacion) {
			publicacionRepository.save(publicacion);
		}	
	 
	 public Optional<Publicacion> findById(Long id){
		 
		 return publicacionRepository.findById(id);
		 
	 }
	 
	 public void deleteById(Long id) {
		 publicacionRepository.deleteById(id);
		 
	 }
	 
	 public Publicacion save(Publicacion publicacion) {
	 
		 return publicacionRepository.save(publicacion);
	}
	
}
