package com.ga.uia.app.Modelaciones.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ga.uia.app.Modelaciones.Model.Transporte;


public interface TransporteRepositoy extends JpaRepository<Transporte,String> {

	
	/*@Query(value= "SELECT ca.num_reg, ca.fecha, ca.id_cacao, ca.precio FROM cacao ca WHERE ca.id_cacao= :id ORDER BY ca.fecha ASC", nativeQuery=true)	
	public List <Cacao> getJoinidCacaoAll(String id);*/
	
	@Query(value= "SELECT t.num_reg, t.id, t.municipio,t.tipocarga, t.unidad ,t.costo  FROM transporte t  WHERE t.id= :id", nativeQuery=true)	
	public List <Transporte> getJoinidTransporteAll(String id);
	
	@Query(value= "SELECT t.num_reg, t.id, t.municipio,t.tipocarga, t.unidad ,t.costo  FROM transporte t  ORDER BY t.municipio", nativeQuery=true)	
	public List <Transporte> getJoinidTransporteAlla();
	
	/*@Query(value= "SELECT t.num_reg, t.id, t.municipio,t.tipocarga, t.unidad ,t.costo  FROM transporte t  WHERE t.id= :id AND t.tipocarga= :tc AND t.unidad= :tu", nativeQuery=true)	
	public List <Transporte> getJoinidTransporteCosto(String id, String tc, String tu);*/
	@Query( value = "SELECT t.num_reg, t.id, t.municipio,t.tipocarga, t.unidad ,t.costo  FROM transporte t  WHERE t.id= :id AND t.tipocarga= :tc AND t.unidad= :tu ", nativeQuery=true)	
	public List <Transporte> getJoinidTransporteCosto(String id, String tc, String tu);
	
	
}
