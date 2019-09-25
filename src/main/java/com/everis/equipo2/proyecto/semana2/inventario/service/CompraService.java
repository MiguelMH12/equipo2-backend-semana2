package com.everis.equipo2.proyecto.semana2.inventario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.everis.equipo2.proyecto.semana2.inventario.model.Compra;
import com.everis.equipo2.proyecto.semana2.inventario.repository.CompraRepository;


@Service
public class CompraService {
	
	@Autowired
	private CompraRepository compraRepository;
	
	public List<Compra> listar(){
		return compraRepository.findAll();
	}
	
	public Compra insertar(Compra compra) {
		return compraRepository.save(compra); //INSERT INTO
	}
	
	public Compra actualizar(Compra Compra) {
		return compraRepository.save(Compra);
	}
	
	public void eliminar(@PathVariable int id) {
		compraRepository.deleteById(id);
	}

}
