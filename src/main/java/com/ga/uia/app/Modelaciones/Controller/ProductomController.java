package com.ga.uia.app.Modelaciones.Controller;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ga.uia.app.Modelaciones.Model.Productom;
import com.ga.uia.app.Modelaciones.Model.Recomendacion;
import com.ga.uia.app.Modelaciones.Repository.FactibilidadRepository;
import com.ga.uia.app.Modelaciones.Repository.ProductomRepository;
import com.ga.uia.app.Modelaciones.Repository.RecomendacionRepository;

@RestController
@RequestMapping("/productosm")
public class ProductomController {
	

	private  final RecomendacionRepository recomendacionRepository;
	private final ProductomRepository productomRepository; 
	
	
	@Autowired
    public ProductomController(RecomendacionRepository recomendacionRepository, ProductomRepository productomRepository) {
        this.recomendacionRepository = recomendacionRepository;
        this.productomRepository = productomRepository;
    }
	
	
	@GetMapping
    public ResponseEntity<Page<Productom>> getAll(Pageable pageable) {
        return ResponseEntity.ok(productomRepository.findAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Productom> getById(@PathVariable String id) {
        Optional<Productom> optionalProductom = productomRepository.findById(id);
        if (!optionalProductom.isPresent()) {
            return ResponseEntity.unprocessableEntity().build();
        }

        return ResponseEntity.ok(optionalProductom.get());
    }
	
	

}
