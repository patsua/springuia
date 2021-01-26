package com.ga.uia.app.Notices.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ga.uia.app.Notices.Model.Publicacion;
import com.ga.uia.app.Notices.Services.PublicacionService;

@RestController
public class PublicacionController {

	@Autowired
	private PublicacionService publicacionService;
	
	@RequestMapping(method=RequestMethod.POST, value="/api/publicaciones")
	public void addPublicacion(@RequestBody Publicacion publicacion) {
		publicacionService.addPublicacion(publicacion);
	}
	
	@RequestMapping(method=RequestMethod.GET, value= "/api/publicaciones")
	public List<Publicacion> findByTitle(@RequestParam(required = false) String title){
		return publicacionService.findByTitleContaining(title);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/api/publicaciones/{id}")
    public ResponseEntity<Publicacion> getPublicacionById(@PathVariable("id") long id) {
	    Optional<Publicacion> opublicacion = publicacionService.findById(id);

	    if (opublicacion.isPresent()) {
	      
	    	return new ResponseEntity<>(opublicacion.get(), HttpStatus.OK);
	    } else {
	      
	    	return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	}
	@RequestMapping(method=RequestMethod.GET, value="/api/publicaciones/estado")
	public   List<Publicacion> findByEstado(){
		 
		  return publicacionService.findByPublished(true);
	
	}
	

	  @RequestMapping(method=RequestMethod.PUT, value="/api/publicaciones/{id}")
	  public ResponseEntity<?> update (@RequestBody Publicacion publicacionDet, @PathVariable("id") long id){
		  Optional<Publicacion> opublic = publicacionService.findById(id);
		  if(!opublic.isPresent()) {
			  return ResponseEntity.notFound().build();
		  }
		  opublic.get().setDescription(publicacionDet.getDescription());
		  opublic.get().setTitle(publicacionDet.getTitle());
		  opublic.get().setPublished(publicacionDet.isPublished());
		  
		  return ResponseEntity.status(HttpStatus.CREATED).body(publicacionService.save(opublic.get()));
	  }
	  
	  @RequestMapping(method=RequestMethod.DELETE, value="/api/publicaciones/{id}")
	  public ResponseEntity<?> delete (@PathVariable("id") long id){
		  
		  if(!publicacionService.findById(id).isPresent()) {
			  return ResponseEntity.notFound().build();
			  
		  }
		  publicacionService.deleteById(id);
		  return ResponseEntity.ok().build();
	  }

}
