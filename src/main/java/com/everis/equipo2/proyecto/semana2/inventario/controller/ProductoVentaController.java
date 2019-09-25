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

import com.everis.equipo2.proyecto.semana2.inventario.model.ProductoVenta;
import com.everis.equipo2.proyecto.semana2.inventario.service.ProductoVentaService;


@RestController
@RequestMapping("productosventas")
public class ProductoVentaController {
	
	@Autowired
	private ProductoVentaService productoventaService;
	
	@GetMapping("/")
	public List<ProductoVenta> listar(){
		return productoventaService.listar();
	}
	
	@PostMapping("/") 
	public ProductoVenta insertar(@RequestBody ProductoVenta productoventa) {
		return productoventaService.insertar(productoventa);
	}
	
	@PutMapping("/")
	public ProductoVenta actualizar(@RequestBody ProductoVenta productoventa) {
		return productoventaService.actualizar(productoventa);
	}
	
	@DeleteMapping("/{id}")
	public boolean eliminar(@PathVariable int id) {
		return productoventaService.eliminar(id);
	}

}
