package com.ga.uia.app.Agrocadena.Cacao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CacaoRepository extends JpaRepository<Cacao,String>{

@Query(value= "SELECT ca.num_reg, ca.fecha, ca.id_cacao, ca.precio FROM cacao ca WHERE ca.id_cacao= :id ORDER BY ca.fecha ASC", nativeQuery=true)	
public List <Cacao> getJoinidCacaoAll(String id);

@Query(value= "SELECT ca.num_reg, ca.fecha, ca.id_cacao, ca.precio FROM cacao ca WHERE ca.id_cacao= :id AND ca.fecha = :fecha ORDER BY ca.fecha ASC", nativeQuery=true)	
public List <Cacao> getJoinidCacaoFecha(String id, String fecha);


}
