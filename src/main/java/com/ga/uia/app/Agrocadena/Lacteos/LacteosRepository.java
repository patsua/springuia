package com.ga.uia.app.Agrocadena.Lacteos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface LacteosRepository extends JpaRepository <Lacteos,String>{
	
	@Query(value= "SELECT ca.num_reg, ca.fecha, ca.id_lacteos, ca.precio FROM lacteos ca WHERE ca.id_lacteos= :id ORDER BY ca.fecha ASC", nativeQuery=true)	
	public List <Lacteos> getJoinidLacteosAll(String id);

	@Query(value= "SELECT ca.num_reg, ca.fecha, ca.id_lacteos, ca.precio FROM lacteos ca WHERE ca.id_lacteos= :id AND ca.fecha = :fecha ORDER BY ca.fecha ASC", nativeQuery=true)	
	public List <Lacteos> getJoinidLacteosFecha(String id, String fecha);


}
