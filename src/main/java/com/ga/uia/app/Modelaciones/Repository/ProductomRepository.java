package com.ga.uia.app.Modelaciones.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ga.uia.app.Modelaciones.Model.Productom;
import com.ga.uia.app.Modelaciones.Model.Recomendacion;
public interface ProductomRepository extends JpaRepository<Productom, String >{
	
	//List<Productom> findByRecomendacion(Recomendacion recomendacion, Sort sort);
	
	

}
