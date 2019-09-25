package com.everis.equipo2.proyecto.semana2.inventario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.equipo2.proyecto.semana2.inventario.model.ProductoVenta;
import com.everis.equipo2.proyecto.semana2.inventario.repository.ProductoVentaRepository;

@Service
public class ProductoVentaService {
	@Autowired
	private ProductoVentaRepository productoventaRepository;
	
	public List<ProductoVenta> listar(){
		return productoventaRepository.findAll();
	}
	
	public ProductoVenta insertar(ProductoVenta productoventa) {
		return productoventaRepository.save(productoventa); 
	}
	
	public ProductoVenta actualizar(ProductoVenta productoventa) {
		return productoventaRepository.saveAndFlush(productoventa);
	}
	
	public boolean eliminar(int id) {
		ProductoVenta encontrada = productoventaRepository.findById(id).get();
		if(encontrada != null) {
			productoventaRepository.deleteById(id);
			return true;
		}else {
			return false;
		}
		
	} 

}
