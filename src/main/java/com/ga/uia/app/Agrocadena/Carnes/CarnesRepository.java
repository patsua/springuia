package com.ga.uia.app.Agrocadena.Carnes;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CarnesRepository extends JpaRepository<Carnes,String>{

	@Query(value= "SELECT ca.num_reg, ca.fecha, ca.id_carnes, ca.precio FROM carnes ca WHERE ca.id_carnes= :id ORDER BY ca.fecha ASC", nativeQuery=true)	
	public List <Carnes> getJoinidCarnesAll(String id);

	@Query(value= "SELECT ca.num_reg, ca.fecha, ca.id_carnes, ca.precio FROM carnes ca WHERE ca.id_carnes= :id AND ca.fecha = :fecha ORDER BY ca.fecha ASC", nativeQuery=true)	
	public List <Carnes> getJoinidCarnesFecha(String id, String fecha);
	

}
