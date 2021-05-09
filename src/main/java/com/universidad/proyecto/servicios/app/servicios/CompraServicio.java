package com.universidad.proyecto.servicios.app.servicios;

import java.util.List;

import com.universidad.proyecto.servicios.app.DTO.CompraDTO;

public interface CompraServicio {
	
	public void insertar(CompraDTO compraDTO) throws Exception;
	
	public List<CompraDTO> listar();

}
