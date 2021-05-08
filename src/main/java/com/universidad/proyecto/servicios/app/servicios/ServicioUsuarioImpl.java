package com.universidad.proyecto.servicios.app.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.universidad.proyecto.servicios.app.modelos.Usuario;
import com.universidad.proyecto.servicios.app.repositorios.UsuarioRepositorio;

@Service
public class ServicioUsuarioImpl implements ServicioUsuario {
	
	@Autowired
	UsuarioRepositorio usuarioRepositorio;

	@Override
	public Usuario insertar(Usuario usuario) throws Exception {
		throw new Exception("Error de prueba");
		//return usuarioRepositorio.save(usuario);
	}

	@Override
	public void actulizar(Usuario usuario) {
		if(usuarioRepositorio.findByTipoDeDocumentoAndDocumento(usuario.getTipoDeDocumento(), usuario.getNumeroDeDocumento()) != null) {
			usuarioRepositorio.save(usuario);
		}
	}

	@Override
	public Usuario consultar(String tipoDeDocumento, String numeroDeDocumento) {
		return usuarioRepositorio.findByTipoDeDocumentoAndDocumento(tipoDeDocumento, numeroDeDocumento);
	}

	@Override
	public List<Usuario> login(String usuario, String contrasena) {
		return usuarioRepositorio.findByUsuarioAndContrasena(usuario, contrasena);
	}


}
