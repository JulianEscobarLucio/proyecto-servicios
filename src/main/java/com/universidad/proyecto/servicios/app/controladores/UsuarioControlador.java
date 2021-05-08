package com.universidad.proyecto.servicios.app.controladores;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.universidad.proyecto.servicios.app.modelos.Usuario;
import com.universidad.proyecto.servicios.app.servicios.ServicioUsuario;

@RestController
@CrossOrigin
@RequestMapping("/api/usuario")
public class UsuarioControlador {
	
	@Autowired
	private ServicioUsuario servicioUsuario;
	
	@GetMapping("/version")
	public ResponseEntity<String> version() {
		return new ResponseEntity<String>(new Date().toString(), HttpStatus.OK);
	}
	
	@PostMapping("/agregar")
	public ResponseEntity<String> agregar(@RequestBody Usuario usuario, UriComponentsBuilder builder) {
		try {
			servicioUsuario.insertar(usuario);
		} catch (Exception e) {
			return new ResponseEntity<String>("El usuario no se guardo", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<String>("Usuario agregado", HttpStatus.OK);
	}
	
	@PutMapping("/actualizar")
	public ResponseEntity<String> actulizar(@RequestBody Usuario usuario, UriComponentsBuilder builder) {
		servicioUsuario.actulizar(usuario);
		return new ResponseEntity<String>("Usuario actualizado", HttpStatus.OK);
	}	
	
	@GetMapping("/consultar/{tipoDeDocumento}/{documento}")
	public ResponseEntity<Usuario> consultar(@PathVariable("tipoDeDocumento") String tipoDeDocumento, @PathVariable("documento") String documento) {
		Usuario usuario = servicioUsuario.consultar(tipoDeDocumento, documento);
		return new ResponseEntity<Usuario>(usuario, HttpStatus.OK);
	}
	
	@GetMapping("/login/{usuario}/{contrasena}")
	public ResponseEntity<List<Usuario>> login(@PathVariable("usuario") String usuario, @PathVariable("contrasena") String contrasena) {
		List<Usuario> usuariList = servicioUsuario.login(usuario, contrasena);
		return new ResponseEntity<List<Usuario>>(usuariList, HttpStatus.OK);
	}
	

   
}
