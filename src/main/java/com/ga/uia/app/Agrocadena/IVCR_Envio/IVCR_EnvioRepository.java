package com.ga.uia.app.Agrocadena.IVCR_Envio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IVCR_EnvioRepository extends JpaRepository <IVCR_Envio,String>{
	

@Query(value= "SELECT ca.num_reg, ca.fecha, ca.id_ivcrenvio, ca.valor FROM ivcr_envio ca WHERE ca.id_ivcrenvio= :id ORDER BY ca.fecha ASC", nativeQuery=true)	
public List <IVCR_Envio> getJoinidIVCREnvioAll(String id);

@Query(value= "SELECT ca.num_reg, ca.fecha, ca.id_ivcrenvio, ca.valor FROM ivcr_envio ca WHERE ca.id_ivcrenvio= :id AND ca.fecha = :fecha ORDER BY ca.fecha ASC", nativeQuery=true)	
public List <IVCR_Envio> getJoinidIVCREnvioFecha(String id, String fecha);

	
	

}
