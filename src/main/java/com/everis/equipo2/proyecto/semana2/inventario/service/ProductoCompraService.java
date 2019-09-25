package com.everis.equipo2.proyecto.semana2.inventario.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.equipo2.proyecto.semana2.inventario.model.ProductoCompra;
import com.everis.equipo2.proyecto.semana2.inventario.repository.ProductoCompraRepository;

@Service
public class ProductoCompraService {
	
	@Autowired
	private ProductoCompraRepository productocompraRepository;
	
	public List<ProductoCompra> listar(){
		return productocompraRepository.findAll();
	}
	
	public ProductoCompra insertar(ProductoCompra productocompra) {
		return productocompraRepository.save(productocompra); 
	}
	
	public ProductoCompra actualizar(ProductoCompra productocompra) {
		return productocompraRepository.saveAndFlush(productocompra);
	}
	
	public boolean eliminar(int id) {
		ProductoCompra encontrada = productocompraRepository.findById(id).get();
		if(encontrada != null) {
			productocompraRepository.deleteById(id);
			return true;
		}else {
			return false;
		}
		
	} 

}
