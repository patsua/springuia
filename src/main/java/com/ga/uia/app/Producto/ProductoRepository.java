package com.ga.uia.app.Producto;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



@Repository
public interface ProductoRepository extends JpaRepository<Producto,String>{
	
	
	 
	 @Query(value="SELECT p.num_registro, p.id_subregion,p.id_municipio, p.id_producto,p.name_subregion,p.name_municipio, p.name_producto, p.anio,  p.tipo_cultivo, p.area_total,p.area_pdccion, p.vol_Prodccion, p.empleoha, p.empleo, p.expl_agric FROM producto p WHERE p.anio = :anio AND p.id_subregion= :id", nativeQuery=true)
	 public List<Producto> getJoinAnioSub(String anio,String id);
	 
	 @Query(value="SELECT p.num_registro, p.id_subregion,p.id_municipio, p.id_producto,p.name_subregion,p.name_municipio, p.name_producto, p.anio,  p.tipo_cultivo, p.area_total,p.area_pdccion, p.vol_prodccion, p.empleoha, p.empleo, p.expl_agric FROM producto p WHERE p.anio = :anio AND p.id_municipio= :id", nativeQuery=true)
	 public List<Producto> getJoinAnioMun(String anio,String id);
	
	 @Query(value="SELECT p.num_registro, p.id_subregion,p.id_municipio, p.id_producto,p.name_subregion,p.name_municipio, p.name_producto, p.anio,  p.tipo_cultivo, p.area_total,p.area_pdccion, p.vol_prodccion, p.empleoha, p.empleo, p.expl_Agric FROM producto p WHERE p.anio = :anio AND p.id_producto= :id", nativeQuery=true)
	 public List<Producto> getJoinAnioProd(String anio,String id);
}
