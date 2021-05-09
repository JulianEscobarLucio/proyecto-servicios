package com.universidad.proyecto.servicios.app.modelos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;


@Entity(name = "servicio")
@Table(name="compra_servicio")
@IdClass(CompraServicioModel.class)
public class CompraServicioModel implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6354843913091643194L;
	
	@Id
	@Column(name="compra",  length = 36 , updatable = false, nullable = false)     
    private Long compra;
	
	@Id
	@Column(name="servicio", length = 36, updatable = false, nullable = false )
    private String servicio;    
    
    
	public CompraServicioModel() {

	}

	public CompraServicioModel(Long idCompra, String idServicio) {
		this.compra = idCompra;
		this.servicio = idServicio;
	}

	public Long getIdCompra() {
		return compra;
	}
	
	public void setIdCompra(Long idCompra) {
		this.compra = idCompra;
	}
	
	public String getIdServicio() {
		return servicio;
	}
	
	public void setIdServicio(String idServicio) {
		this.servicio = idServicio;
	}

	  
}
