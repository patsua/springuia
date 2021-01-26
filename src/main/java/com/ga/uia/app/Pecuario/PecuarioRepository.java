package com.ga.uia.app.Pecuario;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ga.uia.app.Producto.Producto;

@Repository
public interface PecuarioRepository extends JpaRepository<Pecuario, String> {
	
	 
	 @Query(value = "SELECT pe.num_reg, pe.id_subregion, pe.id_municipio, pe.name_subregion,  pe.name_municipio, pe.id_rubro,  pe.name_rubro, pe.id_categoria,  pe.name_categoria, pe.cantidad  FROM pecuario pe WHERE pe.id_subregion = :id AND pe.id_rubro = :rubro", nativeQuery=true ) 
     public List <Pecuario> getJoinSubRubro(String id, String rubro);
	 
	 @Query(value = "SELECT pe.num_reg, pe.id_subregion, pe.id_municipio, pe.name_subregion,  pe.name_municipio, pe.id_rubro,  pe.name_rubro, pe.id_categoria,  pe.name_categoria, pe.cantidad  FROM pecuario pe WHERE pe.id_subregion = :id", nativeQuery=true ) 
     public List <Pecuario> getJoinSub(String id);
	
	 @Query(value = "SELECT pe.num_reg, pe.id_subregion, pe.id_municipio, pe.name_subregion,  pe.name_municipio, pe.id_rubro,  pe.name_rubro, pe.id_categoria,  pe.name_categoria, pe.cantidad  FROM pecuario pe WHERE pe.id_municipio = :id", nativeQuery=true ) 
     public List <Pecuario> getJoinMun(String id);
	 
	 @Query(value = "SELECT pe.num_reg, pe.id_subregion, pe.id_municipio, pe.name_subregion,  pe.name_municipio, pe.id_rubro,  pe.name_rubro, pe.id_categoria,  pe.name_categoria, pe.cantidad  FROM pecuario pe WHERE pe.id_municipio = :id AND pe.id_categoria = :cat", nativeQuery=true ) 
     public List <Pecuario> getJoinmuncat(String id, String cat);
}
