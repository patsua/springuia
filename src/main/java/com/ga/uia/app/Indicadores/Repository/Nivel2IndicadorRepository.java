package com.ga.uia.app.Indicadores.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ga.uia.app.Indicadores.Model.Nivel2Indicador;

@Repository
public interface Nivel2IndicadorRepository extends JpaRepository<Nivel2Indicador,String> {

}
