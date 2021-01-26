package com.ga.uia.app.Agrocadena.III_Envio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface III_EnvioRepository extends JpaRepository<III_Envio,String> {
	

@Query(value= "SELECT ca.num_reg, ca.fecha, ca.id_iiienvio, ca.precio FROM iiienvio ca WHERE ca.id_iiienvio= :id ORDER BY ca.fecha ASC" , nativeQuery=true)	
public List <III_Envio> getJoinIIIEnvioAll(String id);

@Query(value= "SELECT ca.num_reg, ca.fecha, ca.id_iiienvio, ca.precio FROM cacao ca WHERE ca.id_iiienvio= :id AND ca.fecha = :fecha ORDER BY ca.fecha ASC", nativeQuery=true)	
public List <III_Envio> getJoinidIIIEnvioFecha(String id, String fecha);


}
