package com.ga.uia.app.Modelaciones.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ga.uia.app.Modelaciones.Model.Recomendacion;

import com.ga.uia.app.Modelaciones.Repository.ProductomRepository;
import com.ga.uia.app.Modelaciones.Repository.RecomendacionRepository;

@RestController
@RequestMapping("/recomendaciones")
public class RecomendacionController {
	
	
	private final RecomendacionRepository recomendacionRepository;
	private final ProductomRepository productomRepository; 
	
	@Autowired
    public RecomendacionController(RecomendacionRepository recomendacionRepository, ProductomRepository productomRepository) {
        this.recomendacionRepository = recomendacionRepository;
        this.productomRepository = productomRepository;
    }
	
	@GetMapping("/{id}")
    public ResponseEntity<Recomendacion> getById(@PathVariable Long id) {
        Optional<Recomendacion> optionalRecomendacion = recomendacionRepository.findById(id);
        if (!optionalRecomendacion.isPresent()) {
            return ResponseEntity.unprocessableEntity().build();
        }

        return ResponseEntity.ok(optionalRecomendacion.get());
    }

    @GetMapping
    public ResponseEntity<Page<Recomendacion>> getAll(Pageable pageable) {
        return ResponseEntity.ok(recomendacionRepository.findAll(pageable));
    }

}
