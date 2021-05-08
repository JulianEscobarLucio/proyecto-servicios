package com.universidad.proyecto.servicios.app.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.universidad.proyecto.servicios.app.modelos.Servicio;
import com.universidad.proyecto.servicios.app.repositorios.ServicioRepositorio;

@Service
public class ServicioServicioImpl implements ServicioServicio {
	
	@Autowired
	ServicioRepositorio servicioRespositorio;

	@Override
	public void insertar(Servicio servicio) throws Exception {
		servicioRespositorio.save(servicio);
	}

	@Override
	public void actualizar(Servicio servicio) {
		if(servicioRespositorio.findById(servicio.getIdServicio()).isPresent()) {
			servicioRespositorio.save(servicio);
		}
	}

	@Override
	public void eliminar(String id) {
		servicioRespositorio.deleteById(id);
	}

	@Override
	public Optional<Servicio> consultar(String idServicio) {
		return servicioRespositorio.findById(idServicio);
	}

	@Override
	public List<Servicio> listarServicio() {
		return servicioRespositorio.findAll();
	}

}
