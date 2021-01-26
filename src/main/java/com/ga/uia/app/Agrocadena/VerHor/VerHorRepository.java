package com.ga.uia.app.Agrocadena.VerHor;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface VerHorRepository extends JpaRepository<VerHor,String>{
	

@Query(value= "SELECT ca.num_reg, ca.fecha, ca.id_ver_hor, ca.precio FROM VerHor ca WHERE ca.id_ver_hor= :id ORDER BY ca.fecha ASC", nativeQuery=true)	
public List <VerHor> getJoinidVerHorAll(String id);

@Query(value= "SELECT ca.num_reg, ca.fecha, ca.id_ver_hor, ca.precio FROM VerHor ca WHERE ca.id_ver_hor= :id AND ca.fecha = :fecha ORDER BY ca.fecha ASC", nativeQuery=true)	
public List <VerHor> getJoinidVerHorFecha(String id, String fecha);


}
