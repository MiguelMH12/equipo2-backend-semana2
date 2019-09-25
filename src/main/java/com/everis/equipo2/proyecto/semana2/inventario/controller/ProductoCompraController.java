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

import com.everis.equipo2.proyecto.semana2.inventario.model.ProductoCompra;
import com.everis.equipo2.proyecto.semana2.inventario.service.ProductoCompraService;

@RestController
@RequestMapping("productoscompras")
public class ProductoCompraController {
	
	@Autowired
	private ProductoCompraService productocompraService;
	
	@GetMapping("/")
	public List<ProductoCompra> listar(){
		return productocompraService.listar();
	}
	
	@PostMapping("/") 
	public ProductoCompra insertar(@RequestBody ProductoCompra productocompra) {
		return productocompraService.insertar(productocompra);
	}
	
	@PutMapping("/")
	public ProductoCompra actualizar(@RequestBody ProductoCompra productocompra) {
		return productocompraService.actualizar(productocompra);
	}
	
	@DeleteMapping("/{id}")
	public boolean eliminar(@PathVariable int id) {
		return productocompraService.eliminar(id);
	}


}
