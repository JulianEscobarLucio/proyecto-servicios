package com.universidad.proyecto.servicios.app.modelos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "usuario")
@Table(name="tb_usuario")
public class Usuario  implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 2409545635211112152L;

	@Column(name="tipo_de_documento")
	private String tipoDeDocumento;
	
	@Id
	@Column(name="numero_de_documento")
	private String numeroDeDocumento;	
	
	@Column(name="primer_nombre")
	private String primerNombre;
	
	@Column(name="segundo_nombre")
	private String segundoNombre;
	
	@Column(name="primer_apellido")
	private String primerApellido;
	
	@Column(name="segundo_apellido")
	private String segundoApellido;
	
	@Column(name="pais")
	private String pais;
	
	@Column(name="departamento")
	private String departamento;
	
	@Column(name="ciudad")
	private String ciudad;
	
	@Column(name="direccion")
	private String direccion;	
	
	@Column(name="telefono")
	private String telefono;
	
	@Column(name="usuario")
	private String usuario;
	
	@Column(name="contrasena")
	private String constrasena;
	
	public Usuario() {

	}

	public Usuario(String tipoDeDocumento, String numeroDeDocumento, String primerNombre, String segundoNombre,
			String primerApellido, String segundoApellido, String pais, String departamento, String ciudad,
			String direccion, String telefono, String usuario, String constrasena) {
		this.tipoDeDocumento = tipoDeDocumento;
		this.numeroDeDocumento = numeroDeDocumento;
		this.primerNombre = primerNombre;
		this.segundoNombre = segundoNombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.pais = pais;
		this.departamento = departamento;
		this.ciudad = ciudad;
		this.direccion = direccion;
		this.telefono = telefono;
		this.usuario = usuario;
		this.constrasena = constrasena;
	}

	public String getTipoDeDocumento() {
		return tipoDeDocumento;
	}

	public void setTipoDeDocumento(String tipoDeDocumento) {
		this.tipoDeDocumento = tipoDeDocumento;
	}

	public String getNumeroDeDocumento() {
		return numeroDeDocumento;
	}

	public void setNumeroDeDocumento(String numeroDeDocumento) {
		this.numeroDeDocumento = numeroDeDocumento;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
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

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getConstrasena() {
		return constrasena;
	}

	public void setConstrasena(String constrasena) {
		this.constrasena = constrasena;
	}
	
	
	

}
