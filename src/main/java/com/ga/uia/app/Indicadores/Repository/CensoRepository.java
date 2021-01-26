package com.ga.uia.app.Indicadores.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ga.uia.app.Indicadores.Model.Censo;

public interface CensoRepository extends JpaRepository<Censo,Long>{
	
	@Query(value="SELECT c.id,c.valor,c.idmun,c.idsub,c.idvariable,c.indicador,c.namevariable FROM censo WHERE c.idsub= :idsub AND c.idmun= :idmun AND c.indicador= :ind",nativeQuery = true)
	public List <Censo> getJoinCenso(String idsub, String idmun,String ind);

}
