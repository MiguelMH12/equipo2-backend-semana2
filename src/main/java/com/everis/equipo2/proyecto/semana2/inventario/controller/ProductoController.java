package com.everis.equipo2.proyecto.semana2.inventario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.equipo2.proyecto.semana2.inventario.model.Producto;
import com.everis.equipo2.proyecto.semana2.inventario.service.ProductoService;

@RestController
@RequestMapping("productos")
public class ProductoController {
	
	@Autowired
	private ProductoService productoService;
	
	@GetMapping("/")
	public List<Producto> listar(){
		return productoService.listar();
	}
	
	@PostMapping("/")
	public Producto insertar(@RequestBody Producto producto) {
		return productoService.insertar(producto);
	}
	
	@PutMapping("/")
	public Producto actualizar(@RequestBody Producto producto) {
		return productoService.actualizar(producto);
	}
	
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable int id) {
		productoService.eliminar(id);
	}
}
