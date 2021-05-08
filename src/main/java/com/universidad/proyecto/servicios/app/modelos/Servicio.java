package com.universidad.proyecto.servicios.app.modelos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_servicio")
public class Servicio implements Serializable {
	


	/**
	 * 
	 */
	private static final long serialVersionUID = 8188322986121482930L;

	@Id
	@Column(name="id_servicio")
	private String idServicio;
	
	@Column(name="nombre_servicio")
	private String nombreServicio;
	
	@Column(name="descripcion_servicio")
	private String descripcionServicio;
	
	@Column(name="valor_servicio")
	private Integer valorServicio;
	
	@Column(name="imagen")
	private String imagen;
	
	
	public Servicio() {
	}
 
	
	public Servicio(String idServicio, String nombreServicio, String descripcionServicio, Integer valorServicio,
			String imagen) {
		this.idServicio = idServicio;
		this.nombreServicio = nombreServicio;
		this.descripcionServicio = descripcionServicio;
		this.valorServicio = valorServicio;
		this.imagen = imagen;
	}



	public String getImagen() {
		return imagen;
	}


	public void setImagen(String imagen) {
		this.imagen = imagen;
	}




	public String getIdServicio() {
		return idServicio;
	}
	public void setIdServicio(String idServicio) {
		this.idServicio = idServicio;
	}
	public String getNombreServicio() {
		return nombreServicio;
	}
	public void setNombreServicio(String nombreServicio) {
		this.nombreServicio = nombreServicio;
	}
	public String getDescripcionServicio() {
		return descripcionServicio;
	}

	public void setDescripcionServicio(String descripcionServicio) {
		this.descripcionServicio = descripcionServicio;
	}

	public Integer getValorServicio() {
		return valorServicio;
	}
	public void setValorServicio(Integer valorServicio) {
		this.valorServicio = valorServicio;
	}
	
	

}
