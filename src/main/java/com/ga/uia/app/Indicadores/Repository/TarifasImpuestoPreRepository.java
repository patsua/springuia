package com.ga.uia.app.Indicadores.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ga.uia.app.Indicadores.Model.TarifasImpuestoPre;

public interface TarifasImpuestoPreRepository extends JpaRepository<TarifasImpuestoPre,Long> {
	
	@Query(value ="SELECT  t.id, t.idmun,t.namemun,t.promedio_urbana,t.promedio_rural , t.idsub FROM tarifasimpuestopre t WHERE t.idsub= :idsub",nativeQuery=true)
	public List<TarifasImpuestoPre> getJoinidTarifasImpuestoPreAll(String idsub); 

}
