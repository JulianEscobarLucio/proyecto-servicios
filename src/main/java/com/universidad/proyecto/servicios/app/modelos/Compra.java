package com.universidad.proyecto.servicios.app.modelos;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="tb_compra")
@SequenceGenerator(name="seq", initialValue=1, allocationSize=100)
public class Compra implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8530539988532923484L;
	
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	@Column(name="id" ,  length = 36 , updatable = false, nullable = false)
	private Long id;
	
	@Column(name="nombre_cliente")
	private String nombreCliente;
	
	@Column(name="direccion")
	private String direccion;
	
	@Column(name="telefono")
	private String telefono;
	
	@Column(name="estado")
	private String estado;
	
	
	

	public Compra() {

	}

	public Compra(String nombreCliente, String direccion, String telefono, String estado) {

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

}
