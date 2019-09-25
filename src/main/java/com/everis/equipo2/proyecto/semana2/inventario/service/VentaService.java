package com.everis.equipo2.proyecto.semana2.inventario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.everis.equipo2.proyecto.semana2.inventario.model.Venta;
import com.everis.equipo2.proyecto.semana2.inventario.repository.VentaRepository;


@Service
public class VentaService {

	@Autowired
	private VentaRepository ventaRepository;
	
	public List<Venta> listar(){
		return ventaRepository.findAll();
	}


	public Venta insertarVenta (Venta venta) {
		return ventaRepository.save(venta); //INSERT INTO
	}
	
	public Venta actualizarVenta (Venta venta) {
		return ventaRepository.save(venta); //INSERT INTO
	}

	public void eliminarVenta(@PathVariable int id) {
		ventaRepository.deleteById(id);   
		
	}
	
}
