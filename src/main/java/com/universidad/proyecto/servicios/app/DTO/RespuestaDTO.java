package com.universidad.proyecto.servicios.app.DTO;

import java.io.Serializable;

public class RespuestaDTO implements Serializable   {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6572059058874859367L;
	private String mensaje;
	private Object objeto;
	
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public Object getObjeto() {
		return objeto;
	}
	public void setObjeto(Object objeto) {
		this.objeto = objeto;
	}

}
