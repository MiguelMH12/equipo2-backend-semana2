package com.everis.equipo2.proyecto.semana2.inventario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.equipo2.proyecto.semana2.inventario.model.Producto;
import com.everis.equipo2.proyecto.semana2.inventario.repository.ProductoRepository;

@Service
public class ProductoService {
	
	@Autowired
	private ProductoRepository productoRepository;
	
	public List<Producto> listar(){
		return productoRepository.findAll();
	}
	
	public Producto insertar(Producto producto) {
		return productoRepository.save(producto);
	}
	
	public Producto actualizar(Producto producto) {
		return productoRepository.saveAndFlush(producto);
	}
	
	public void eliminar(int id) {
		productoRepository.deleteById(id);
	}
}
