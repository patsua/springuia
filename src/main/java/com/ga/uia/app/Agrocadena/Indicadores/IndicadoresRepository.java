package com.ga.uia.app.Agrocadena.Indicadores;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ga.uia.app.mercado.Model.Agrocadena;

@Repository
public interface IndicadoresRepository extends JpaRepository<Indicadores,String> {
	
	@Query(value= "SELECT ca.num_reg, ca.id_indicador, ca.nameindicador, ca.id_variable, ca.descripcion, ca.unidad, ca.fuente,ca.idagrocadena, ca.nameagrocadena FROM indicadores ca WHERE ca.idagrocadena = :id", nativeQuery=true)	
	public List <Indicadores> getJoinidIndicadores(String id);
	

	@Query(value= "SELECT ca.num_reg, ca.id_indicador, ca.nameindicador, ca.id_variable, ca.descripcion, ca.unidad, ca.fuente,ca.idagrocadena, ca.nameagrocadena FROM indicadores ca WHERE ca.idagrocadena = :id AND ca.id_indicador= :indi" , nativeQuery=true)
   public List <Indicadores> getJoinidIndicadoresAll(String id, String indi);

}
