package com.bandtec.techconnective.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bandtec.techconnective.common.UsuarioRepository;
import com.bandtec.techconnective.model.Usuario;

@RestController
@CrossOrigin(origins = "*")
public class UsuarioController {
	
	private final UsuarioRepository usuarioRepository;
	
	@Autowired
	public UsuarioController(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}
	
	@GetMapping("/usuarios/nome/{nomeDoUsuario}")
	public ResponseEntity<List<Usuario>> obterPorNome(@PathVariable("nomeDoUsuario") String nome) {
		List<Usuario> usuarioPorNome = usuarioRepository.porNome(nome);
		if(usuarioPorNome.isEmpty()) return ResponseEntity.noContent().build();
		else return ResponseEntity.ok(usuarioPorNome);
	}
}
