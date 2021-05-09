package com.universidad.proyecto.servicios.app.repositorios;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.universidad.proyecto.servicios.app.modelos.Compra;

public interface CompraRespositorio extends JpaRepository<Compra, String>{
	Void save(Optional<Compra> compraToUpdate);	

}
