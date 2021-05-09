	package com.universidad.proyecto.servicios.app.modelos;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_servicio")
public class Servicio implements Serializable {
	


	/**
	 * 
	 */
	private static final long serialVersionUID = 8188322986121482930L;

	@Id
	@Column(name="id_servicio" ,  length = 36 , updatable = false, nullable = false)
	private String idServicio;
	
	@Column(name="nombre_servicio")
	private String nombre;
	
	@Column(name="descripcion_servicio")
	private String descripcion;
	
	@Column(name="valor_servicio")
	private Integer precio;
	
	@Column(name="imagen")
	private String imagen;
	

	public Servicio() {
	}
 
	
	public Servicio(String idServicio, String nombreServicio, String descripcionServicio, Integer valorServicio,
			String imagen) {
		this.idServicio = idServicio;
		this.nombre = nombreServicio;
		this.descripcion = descripcionServicio;
		this.precio = valorServicio;
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
		return nombre;
	}
	public void setNombreServicio(String nombreServicio) {
		this.nombre = nombreServicio;
	}
	public String getDescripcionServicio() {
		return descripcion;
	}

	public void setDescripcionServicio(String descripcionServicio) {
		this.descripcion = descripcionServicio;
	}

	public Integer getValorServicio() {
		return precio;
	}
	public void setValorServicio(Integer valorServicio) {
		this.precio = valorServicio;
	}
	
	

}
