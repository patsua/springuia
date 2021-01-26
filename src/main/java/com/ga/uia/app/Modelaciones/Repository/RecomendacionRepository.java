package com.ga.uia.app.Modelaciones.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.ga.uia.app.Modelaciones.Model.Recomendacion;
public interface RecomendacionRepository extends JpaRepository<Recomendacion, Long> {
	
	//Recomendacion findByUsos(String usos);

}
