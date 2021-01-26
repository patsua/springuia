package com.ga.uia.app.mercado.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ga.uia.app.mercado.Model.Agrocadena;


public interface  AgrocadenaRepository extends JpaRepository<Agrocadena,String> {
	
@Query(value= "SELECT ca.num_reg, ca.fecha, ca.id_variable, ca.valor,ca.id_agrocadena,ca.id_indicador FROM agrocadena ca WHERE ca.id_agrocadena= :id AND ca.id_indicador =:indi  ORDER BY ca.fecha ASC", nativeQuery=true)	
public List <Agrocadena> getJoinidAgrocadenaAllT(String id, String indi);

@Query(value= "SELECT ca.num_reg, ca.fecha, ca.id_variable, ca.valor,ca.id_agrocadena,ca.id_indicador FROM agrocadena ca WHERE ca.id_agrocadena= :id AND ca.id_indicador =:indi AND ca.id_variable = :var ORDER BY ca.fecha ASC", nativeQuery=true)	
public List <Agrocadena> getJoinidAgrocadenaAll(String id, String indi, String var);

@Query(value= "SELECT ca.num_reg, ca.fecha, ca.id_variable, ca.valor,ca.id_agrocadena,ca.id_indicador FROM agrocadena ca WHERE ca.id_agrocadena= :id AND ca.id_indicador =:indi AND ca.id_variable = :var AND ca.fecha BETWEEN  :fecha1 AND :fecha2 ORDER BY ca.fecha ASC", nativeQuery=true)	
public List <Agrocadena> getJoinidAgrocadenaFecha(String id, String indi, String var,String fecha1, String fecha2);

}
