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

import com.everis.equipo2.proyecto.semana2.inventario.model.Compra;
import com.everis.equipo2.proyecto.semana2.inventario.service.CompraService;


@RestController
@RequestMapping("compras")
public class CompraController {

	@Autowired
	private CompraService compraService;
	
	@GetMapping("/")
	public List<Compra> listar() {
		return compraService.listar();
	}
	
	@PostMapping("/")//Verbos http
	public Compra insertar(@RequestBody Compra compra) {
		return compraService.insertar(compra);
	}
	
	@PutMapping("/")
	public Compra actualizar(@RequestBody Compra compra) {
		return compraService.actualizar(compra);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable int id) {
		compraService.eliminar(id);	
	}
	
}
