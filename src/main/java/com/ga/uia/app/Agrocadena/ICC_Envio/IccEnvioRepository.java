package com.ga.uia.app.Agrocadena.ICC_Envio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IccEnvioRepository extends JpaRepository<IccEnvio,String> {
	

@Query(value= "SELECT ca.num_reg, ca.fecha, ca.idiccenvio, ca.precio FROM iccenvio ca WHERE ca.idiccenvio= :id ORDER BY ca.fecha ASC", nativeQuery=true)	
public List <IccEnvio> getJoinidIccEnvioAll(String id);

@Query(value= "SELECT ca.num_reg, ca.fecha, ca.idiccenvio, ca.precio FROM iccenvio ca WHERE ca.id_idiccenvio= :id AND ca.fecha = :fecha ORDER BY ca.fecha ASC ", nativeQuery=true)	
public List <IccEnvio> getJoinidIccEnvioFecha(String id, String fecha);


}
