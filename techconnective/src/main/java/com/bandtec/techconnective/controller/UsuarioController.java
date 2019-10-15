package com.bandtec.techconnective.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bandtec.techconnective.dao.UsuarioRepository;
import com.bandtec.techconnective.model.Usuario;

@CrossOrigin(origins = "*")
@RestController
public class UsuarioController {
	
	private UsuarioRepository usuarioRepository;
	
	//public UsuarioController() {}
	
	@Autowired
	public UsuarioController(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}
	
	@GetMapping("/usuario/nome/{nomeDoUsuario}")
	public ResponseEntity<List<Usuario>> obterPorNome(@PathVariable("nomeDoUsuario") String nome) {
		List<Usuario> usuarioPorNome = usuarioRepository.porNome(nome);
		if(usuarioPorNome.isEmpty()) return ResponseEntity.noContent().build();
		else return ResponseEntity.ok(usuarioPorNome);
	}
	
	@PostMapping("/usuario")
	public ResponseEntity<String> cadastrarUsuario(@RequestBody Usuario usuario){
		usuarioRepository.save(usuario);
		return ResponseEntity.ok("Sucesso");
	}
}
