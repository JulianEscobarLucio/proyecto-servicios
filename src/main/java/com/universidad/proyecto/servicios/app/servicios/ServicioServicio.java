
package com.universidad.proyecto.servicios.app.servicios;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.universidad.proyecto.servicios.app.modelos.Servicio;

public interface ServicioServicio {
  
	public void insertar(Servicio servicio) throws Exception;
	
	public void actualizar(Servicio servicio);
	
	public void eliminar(String id);
	
	public Optional<Servicio>  consultar(String idServicio) ;
	
	public List<Servicio> listarServicio() ;

}
