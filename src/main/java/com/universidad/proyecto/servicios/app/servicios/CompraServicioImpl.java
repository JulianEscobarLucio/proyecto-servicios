package com.universidad.proyecto.servicios.app.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.universidad.proyecto.servicios.app.DTO.CompraDTO;
import com.universidad.proyecto.servicios.app.DTO.ServicioDTO;
import com.universidad.proyecto.servicios.app.modelos.Compra;
import com.universidad.proyecto.servicios.app.modelos.CompraServicioModel;
import com.universidad.proyecto.servicios.app.modelos.Servicio;
import com.universidad.proyecto.servicios.app.repositorios.CompraRespositorio;
import com.universidad.proyecto.servicios.app.repositorios.CompraServicioRepositorio;
import com.universidad.proyecto.servicios.app.repositorios.ServicioRepositorio;


@Service

public class CompraServicioImpl implements CompraServicio {
	
	@Autowired
	CompraRespositorio compraRespositorio;
	
	@Autowired
	CompraServicioRepositorio compraServicioRepositorio;
	
	@Autowired
	ServicioRepositorio servicioRepositorio;

	@Override
	public void insertar(CompraDTO compraDTO) throws Exception {
		Compra compra = new Compra(compraDTO.getNombreCliente(), compraDTO.getDireccion(), compraDTO.getTelefono(), compraDTO.getEstado());
		Compra aCompra = compraRespositorio.save(compra);
		compraDTO.getServicios().forEach(servicio -> {
			CompraServicioModel compraServicio = new CompraServicioModel(aCompra.getId(), servicio.getIdServicio());
			compraServicioRepositorio.save(compraServicio);
		});	
       System.out.print(compraServicioRepositorio.toString());
	}

	@Override
	public List<CompraDTO> listar() {
		List<Compra> compraList = compraRespositorio.findAll();
		List<CompraDTO> compraDTOList = new ArrayList<CompraDTO>();
		List<ServicioDTO> servicioList = new ArrayList<ServicioDTO>();

		compraList.forEach(item -> {
			List<CompraServicioModel> compraServicioList = compraServicioRepositorio.findByIdCompra(item.getId());
			compraServicioList.forEach(compraServicio -> {
				Optional<Servicio> servicio =  servicioRepositorio.findById(compraServicio.getIdServicio());
				if(servicio.isPresent()) {				
					ServicioDTO  servicioDTO = new ServicioDTO(servicio.get().getIdServicio(), servicio.get().getNombreServicio(), 
							servicio.get().getDescripcionServicio(), servicio.get().getValorServicio(), servicio.get().getImagen());
					servicioList.add(servicioDTO);	
				}
			});
			
			CompraDTO aCompraDTO = new CompraDTO(item.getId(), servicioList, item.getNombreCliente(), item.getDireccion(), item.getTelefono(), item.getEstado());
			compraDTOList.add(aCompraDTO);
		}); 	
		
		return compraDTOList;
	}

}
