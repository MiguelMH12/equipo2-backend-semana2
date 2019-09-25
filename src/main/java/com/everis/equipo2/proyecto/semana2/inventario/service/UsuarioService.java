package com.everis.equipo2.proyecto.semana2.inventario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.equipo2.proyecto.semana2.inventario.model.Usuario;
import com.everis.equipo2.proyecto.semana2.inventario.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<Usuario> list(){
		return usuarioRepository.findAll();
	}
	
	public Usuario insertar(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	public Usuario actualizar(Usuario usuario) {
		return usuarioRepository.saveAndFlush(usuario);
	}
	
	public void eliminar(int id) {
		usuarioRepository.deleteById(id);
	}
}
