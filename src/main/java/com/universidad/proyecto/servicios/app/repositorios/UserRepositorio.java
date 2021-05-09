package com.universidad.proyecto.servicios.app.repositorios;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.universidad.proyecto.servicios.app.modelos.User;
import com.universidad.proyecto.servicios.app.modelos.Usuario;

public interface UserRepositorio extends JpaRepository<Usuario, String> {
	Void save(Optional<User> usuarioToUpdate);
	
	
    @Query("select us from user us  where us.usuario=(:usuario) AND us.contrasena= (:contrasena)")
	List<User> findByUsuarioAndContrasena(@Param("usuario") String usuario, @Param("contrasena") String contrasena );


}
