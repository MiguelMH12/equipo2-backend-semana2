package com.everis.equipo2.proyecto.semana2.inventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.equipo2.proyecto.semana2.inventario.model.Venta;

@Repository
public interface VentaRepository extends JpaRepository <Venta, Integer>{
	

}
