package com.universidad.proyecto.servicios.app.modelos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity(name = "user")
@Table(name="tb_user")
@IdClass(User.class)
public class User  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -688299411788931798L;
	
	@Id
	@Column(name="usuario" ,  length = 36 , updatable = false, nullable = false)
	private String usuario;
	
	@Id
	@Column(name="contrasena" ,  length = 36 , updatable = false, nullable = false)
	private String contrasena;
	
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	
}
