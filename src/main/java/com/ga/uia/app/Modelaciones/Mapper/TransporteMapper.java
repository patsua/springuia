package com.ga.uia.app.Modelaciones.Mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.ga.uia.app.Modelaciones.DTO.TransporteDTO;
import com.ga.uia.app.Modelaciones.Model.Transporte;

@Mapper
public interface TransporteMapper {
	
	TransporteDTO toTransporteDTO(Transporte transporte);
	
	List<TransporteDTO> toTransporteDTOs(List<Transporte> transporte);

}
