package com.everis.equipo2.proyecto.semana2.inventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.everis.equipo2.proyecto.semana2.inventario.model.ProductoVenta;

@Repository
public interface ProductoVentaRepository extends JpaRepository<ProductoVenta, Integer>{

}
