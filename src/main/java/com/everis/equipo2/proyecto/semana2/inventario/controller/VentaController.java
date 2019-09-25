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

import com.everis.equipo2.proyecto.semana2.inventario.model.Venta;
import com.everis.equipo2.proyecto.semana2.inventario.repository.VentaRepository;
import com.everis.equipo2.proyecto.semana2.inventario.service.VentaService;

@RestController  //se agregan al contexto, si no da el error de que no escuentra el contexto de
@RequestMapping("venta")
public class VentaController {

	@Autowired
	private VentaService ventaService;
	@GetMapping("/")
	public List<Venta> listar(){
		return ventaService.listar(); //gracias al jpa Repository SELECT + FROM Cliente
	}

	@PostMapping("/")
	public Venta insertarVenta (@RequestBody Venta venta) {
		return ventaService.insertarVenta(venta); //INSERT INTO
	}
	@PutMapping("/")
	public Venta actualizarVenta (@RequestBody Venta venta) {
		return ventaService.actualizarVenta(venta); //INSERT INTO
	}
	@DeleteMapping("/{id}")
	public void eliminarVenta(@PathVariable int id) {
		 ventaService.eliminarVenta(id);
	}
	
}
