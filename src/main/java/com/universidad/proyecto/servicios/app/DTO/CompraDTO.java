package com.universidad.proyecto.servicios.app.DTO;

import java.util.List;

import com.universidad.proyecto.servicios.app.modelos.Servicio;

public class CompraDTO {
	
	private Long id;
	private List<ServicioDTO> servicios;
	private String nombreCliente;
	private String direccion;
	private String telefono;
	private String estado;
	
	
	
	public CompraDTO(Long id, List<ServicioDTO> servicios, String nombreCliente, String direccion, String telefono,
			String estado) {
		this.id = id;
		this.setServicios(servicios);
		this.nombreCliente = nombreCliente;
		this.direccion = direccion;
		this.telefono = telefono;
		this.estado = estado;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
   
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public List<ServicioDTO> getServicios() {
		return servicios;
	}

	public void setServicios(List<ServicioDTO> servicios) {
		this.servicios = servicios;
	}



}
