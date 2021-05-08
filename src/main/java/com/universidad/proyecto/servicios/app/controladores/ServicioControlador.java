package com.universidad.proyecto.servicios.app.controladores;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
import com.universidad.proyecto.servicios.app.modelos.Servicio;
import com.universidad.proyecto.servicios.app.servicios.ServicioServicio;

@RestController
@CrossOrigin
@RequestMapping("/api/servicio")
public class ServicioControlador {
	
	@Autowired
	private ServicioServicio serviciServicio;
	
	
	@PostMapping("/agregar")
	public ResponseEntity<String> agregar(@RequestBody Servicio servicio, UriComponentsBuilder builder) throws Exception {
		serviciServicio.insertar(servicio);		
		return new ResponseEntity<String>("Servicio agregado", HttpStatus.OK);
	}
	
	@PutMapping("/actualizar")
	public ResponseEntity<String> actualizar(@RequestBody Servicio servicio, UriComponentsBuilder builder) throws Exception {
		serviciServicio.insertar(servicio);
		return new ResponseEntity<String>("Servicio actualizado", HttpStatus.OK);
	}
	
	@GetMapping("/consultar/{idServicio}")
	public ResponseEntity<Optional<Servicio>> consultar(@PathVariable("idServicio") String idServicio) {
		Optional<Servicio> servicio = serviciServicio.consultar(idServicio);
		return new ResponseEntity<Optional<Servicio>>(servicio, HttpStatus.OK);
	}
	
	
	@GetMapping("/listar")
	public ResponseEntity<List<Servicio>> listar() {
		List<Servicio> servicios =  serviciServicio.listarServicio();
		return new ResponseEntity<List<Servicio>>(servicios, HttpStatus.OK);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public ResponseEntity<String> eliminar(@PathVariable("id") String id) {
		serviciServicio.eliminar(id);
		return new ResponseEntity<String>("Servicio eliminado", HttpStatus.OK);
	}

	

}
