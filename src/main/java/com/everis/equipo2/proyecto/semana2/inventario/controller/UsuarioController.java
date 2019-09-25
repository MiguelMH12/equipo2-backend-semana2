package com.everis.equipo2.proyecto.semana2.inventario.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.equipo2.proyecto.semana2.inventario.model.Usuario;
import com.everis.equipo2.proyecto.semana2.inventario.service.UsuarioService;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("/")
	public List<Usuario> list(){
		return usuarioService.list();
	}
	
	@PostMapping("/")
	public Usuario insertar(@RequestBody Usuario usuario) {
		return usuarioService.insertar(usuario);
	}
	
	@PutMapping("/")
	public Usuario actualizar(@RequestBody Usuario usuario) {
		return usuarioService.actualizar(usuario);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable int id) {
		usuarioService.eliminar(id);
	}
	
}
