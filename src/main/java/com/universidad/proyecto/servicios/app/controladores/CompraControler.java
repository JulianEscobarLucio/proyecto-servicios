package com.universidad.proyecto.servicios.app.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
import com.universidad.proyecto.servicios.app.DTO.CompraDTO;
import com.universidad.proyecto.servicios.app.DTO.RespuestaDTO;
import com.universidad.proyecto.servicios.app.servicios.CompraServicio;

@RestController
@CrossOrigin
@RequestMapping("/api/compra")
public class CompraControler {
	
	@Autowired
	CompraServicio compraServicio;
	
	
	@PostMapping("/agregar")
	public ResponseEntity<RespuestaDTO> agregar(@RequestBody CompraDTO compraDTO, UriComponentsBuilder builder) throws Exception {
     	compraServicio.insertar(compraDTO);
     	RespuestaDTO respuesta = new RespuestaDTO();
     	respuesta.setMensaje("Compra agregada");
		return new ResponseEntity<RespuestaDTO>(respuesta, HttpStatus.OK);		
	}
	
	@GetMapping("/listar")
	public ResponseEntity<List<CompraDTO>> listar() { 
		List<CompraDTO> compraList =  compraServicio.listar();
		return  new ResponseEntity<List<CompraDTO>>(compraList, HttpStatus.OK);
	}

}
