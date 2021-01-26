package com.ga.uia.app.Indicadores.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.ga.uia.app.Indicadores.Model.PreciosTierra;


@Repository
public interface PreciosTierraRepository extends JpaRepository <PreciosTierra,Long>{

	@Query(value= "SELECT p.id,p.idmun, p.idsub,p.namemun, p.rango, p.area,p.porcentaje FROM preciostierra p WHERE p.idsub= :idsub",nativeQuery=true)	
	public List <PreciosTierra> getJoinidPreciosTierra(String idsub);
}
