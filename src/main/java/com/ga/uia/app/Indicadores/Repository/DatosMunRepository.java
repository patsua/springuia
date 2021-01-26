package com.ga.uia.app.Indicadores.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ga.uia.app.Indicadores.Model.DatosMun;
@Repository
public interface DatosMunRepository extends JpaRepository<DatosMun,Long> {
	
	@Query(value = "SELECT d.id, d.id_sub,  d.idmun, d.namemun, d.areamun, d.habitrural, d.gini FROM datos_mun d WHERE d.id_sub= :idsub",nativeQuery=true)
	public List <DatosMun> getJoinAll(String idsub);

}
