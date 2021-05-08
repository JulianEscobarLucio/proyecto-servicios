package com.universidad.proyecto.servicios.app.servicios;

import java.util.List;

import com.universidad.proyecto.servicios.app.modelos.Usuario;

public interface ServicioUsuario {
	public Usuario insertar(Usuario usuario) throws Exception;
	public void actulizar(Usuario usuario);
	public Usuario consultar(String tipoDeDocumento, String numeroDeDocumento);
	public List<Usuario> login(String usuario, String contrasena);

}
