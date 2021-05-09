package com.universidad.proyecto.servicios.app.repositorios;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.universidad.proyecto.servicios.app.modelos.CompraServicioModel;

public interface CompraServicioRepositorio  extends JpaRepository<CompraServicioModel, String> {
	Void save(Optional<CompraServicioModel> compraServicioModelToUpdate);
	
	
    @Query("select co from servicio co  where co.compra=(:idCompra)")    
	List<CompraServicioModel> findByIdCompra(@Param("idCompra") Long idCompra);

}
