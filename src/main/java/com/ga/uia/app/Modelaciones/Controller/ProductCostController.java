package com.ga.uia.app.Modelaciones.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ga.uia.app.Modelaciones.Model.ProductCost;

import com.ga.uia.app.Modelaciones.Services.ProductCostService;

@RestController
public class ProductCostController {
	
	@Autowired
	private ProductCostService productCostService;
	
	@RequestMapping(method=RequestMethod.GET, value ="/calculo/producto/{id}")
	public List<ProductCost> getAll_idProductCost(@PathVariable String id){
		return productCostService.getJoinidProductCostAll(id);
	}
	
	@RequestMapping(method=RequestMethod.GET, value ="/calculo")
	public List<ProductCost> getAll_idProductCost(){
		return productCostService.getJoinidProductCostAlla();
	}
	

}
