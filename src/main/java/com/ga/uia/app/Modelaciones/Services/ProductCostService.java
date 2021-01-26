package com.ga.uia.app.Modelaciones.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ga.uia.app.Modelaciones.Model.ProductCost;
import com.ga.uia.app.Modelaciones.Repository.ProductCostRepository;

@Service
public class ProductCostService {
	
	@Autowired
	private ProductCostRepository productCostRepository;
	
	public List <ProductCost> getJoinidProductCostAll(String id){
		    List <ProductCost> prodcost = new ArrayList<>();
		    productCostRepository.getJoinidProductCostAll(id)
		    .forEach(prodcost:: add);
		    return prodcost;
			
	}
	public List <ProductCost> getJoinidProductCostAlla(){
	    List <ProductCost> prodcost = new ArrayList<>();
	    productCostRepository.getJoinidProductCostAlla()
	    .forEach(prodcost:: add);
	    return prodcost;
	
	
	}
}
