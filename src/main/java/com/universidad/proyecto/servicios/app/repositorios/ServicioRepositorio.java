package com.universidad.proyecto.servicios.app.repositorios;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.universidad.proyecto.servicios.app.modelos.Servicio;

public interface ServicioRepositorio extends JpaRepository<Servicio, String> {
	Void save(Optional<Servicio> servicioToUpdate);	

}
