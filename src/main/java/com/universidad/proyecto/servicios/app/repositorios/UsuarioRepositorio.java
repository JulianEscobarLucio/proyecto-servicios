package com.universidad.proyecto.servicios.app.repositorios;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.universidad.proyecto.servicios.app.modelos.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, String> {
	
	Void save(Optional<Usuario> usuarioToUpdate);
	
    @Query("select us from usuario us  where us.tipoDeDocumento=(:tipoDeDocumento) AND us.numeroDeDocumento= (:numeroDeDocumento)")
	Usuario findByTipoDeDocumentoAndDocumento(@Param("tipoDeDocumento") String tipoDeDocumento, @Param("numeroDeDocumento") String numeroDeDocumento );
    
    @Query("select us from usuario us  where us.usuario=(:usuario) AND us.constrasena= (:contrasena)")
	List<Usuario> findByUsuarioAndContrasena(@Param("usuario") String usuario, @Param("contrasena") String contrasena );

}
