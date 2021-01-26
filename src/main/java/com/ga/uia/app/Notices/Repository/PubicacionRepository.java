package com.ga.uia.app.Notices.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ga.uia.app.Notices.Model.Publicacion;
import java.util.Optional;

public interface PubicacionRepository extends JpaRepository<Publicacion,Long> {
		
	public List<Publicacion> findByPublished(boolean published);
	public List<Publicacion> findByTitleContaining(String title);
	public Optional<Publicacion> findById(Long id);
	public void deleteById(Long id);
	public Publicacion save(Publicacion publicacion);
}
