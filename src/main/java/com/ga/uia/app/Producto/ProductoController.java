package com.ga.uia.app.Producto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductoController {
	
	@Autowired
	private ProductoService productoService;

	@RequestMapping("/welcome")
	public String welcomepage() {
		return "Welcome to Yawin Tutor";
	}	
	
	@RequestMapping(method=RequestMethod.GET, value="{anio}/subregiones/{id}/productos")
	public List<Producto> getAllProductosSub(@PathVariable String anio, @PathVariable String id){
		return productoService.getJoinSubregion(anio,id);
	}
	@RequestMapping(method=RequestMethod.GET, value="{anio}/municipios/{id}/productos")
	public List<Producto> getAllProductosMun(@PathVariable String anio,@PathVariable String id){
		return productoService.getJoinMunicipio(anio,id);
	}

	@RequestMapping(method=RequestMethod.GET, value="{anio}/productos/{id}/productos")
	public List<Producto> getAllProductosProd(@PathVariable String anio,@PathVariable String id){
		return productoService.getJoinProducto(anio,id);
	}
	
	/*@RequestMapping("/productos/{id}")
		public Producto getProducto(@PathVariable String id) {
		return productoService.getProducto(id);
	}*/
	
	@RequestMapping(method=RequestMethod.POST, value="/productos")
	public void addProducto(@RequestBody Producto producto) {
		productoService.addProducto(producto);
	}

}
