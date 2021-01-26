package com.ga.uia.app.Producto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductoService {
	
	
	@Autowired
	private ProductoRepository productoRepository;
	

	public List<Producto> getJoinSubregion(String anio,String id){
		List<Producto> productos = new ArrayList<>();
		productoRepository.getJoinAnioSub(anio,id)
		.forEach(productos::add);
		return productos;
	}
	
	public List<Producto> getJoinMunicipio(String anio,String id){
		List<Producto> productos = new ArrayList<>();
		productoRepository.getJoinAnioMun(anio,id)
		.forEach(productos::add);
		return productos;
	}
	
	public List<Producto> getJoinProducto(String anio,String id){
		List<Producto> productos = new ArrayList<>();
		productoRepository.getJoinAnioProd(anio,id)
		.forEach(productos::add);
		return productos;
	}
	
		
	public void addProducto(Producto producto) {
		productoRepository.save(producto);
	}

}
