package com.ga.uia.app.Modelaciones.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ga.uia.app.Modelaciones.Model.Factibilidad;


@Repository
public interface FactibilidadRepository extends JpaRepository<Factibilidad,Long> {
	
	@Query(value= "SELECT f.id,  f.codmun, f.codprod,  f.a1,  f.a2,  f.a3, f.total FROM factibilidad f WHERE f.codmun= :idm  AND f.codprod =:idp ", nativeQuery=true)	
	public List <Factibilidad> getJoinidFactibilidad(String idm, String idp);

}
