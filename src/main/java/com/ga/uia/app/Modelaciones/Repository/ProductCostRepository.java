package com.ga.uia.app.Modelaciones.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ga.uia.app.Modelaciones.Model.ProductCost;


public interface ProductCostRepository extends JpaRepository<ProductCost, String> {
	
	@Query(value= "SELECT t.idproduct , t.idagro, t.nameproduct, t.costo, t.precio  FROM productcost t  WHERE t.idproduct= :id", nativeQuery=true)	
	public List <ProductCost> getJoinidProductCostAll(String id);
	
	@Query(value= "SELECT t.idproduct , t.idagro, t.nameproduct, t.costo, t.precio  FROM productcost t ORDER BY t.idagro", nativeQuery=true)	
	public List <ProductCost> getJoinidProductCostAlla();
	
	
}
