package com.bandtec.techconnective.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bandtec.techconnective.dao.UsuarioRepository;
import com.bandtec.techconnective.model.Usuario;

@CrossOrigin(origins = "*")
@RequestMapping("/api")
@RestController
public class UsuarioController {
	
	private UsuarioRepository usuarioRepository;
	
	//public UsuarioController() {}
	
	@Autowired
	public UsuarioController(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}
	
	@GetMapping("/usuario")
	public ResponseEntity<List<Usuario>> obterPorNome(@PathVariable("nomeDoUsuario") String nome) {
		List<Usuario> usuarioPorNome = usuarioRepository.porNome(nome);
		if(usuarioPorNome.isEmpty()) return ResponseEntity.noContent().build();
		else return ResponseEntity.ok(usuarioPorNome);
	}
	
	@PostMapping("/usuario/criar")
	public ResponseEntity<String> cadastrarUsuario(@RequestBody Usuario usuario){
		usuarioRepository.save(usuario);
		return ResponseEntity.ok("Sucesso");
	}
	
<<<<<<< HEAD
	@PutMapping("/usuario/{id}")
	public ResponseEntity<Usuario> updateUsuario(@PathVariable("id") String id, @RequestBody Usuario usuario) {
		System.out.println("Atualizando usuario do ID = " + id + "...");

		Optional<Usuario> dadoUsuario = usuarioRepository.findById(id);

		if (dadoUsuario.isPresent()) {
			Usuario _usuario = dadoUsuario.get();
			_usuario.setContato(usuario.getContato());
			_usuario.setCredenciais(usuario.getCredenciais());
			_usuario.setEndereco(usuario.getEndereco());
			return new ResponseEntity<>(usuarioRepository.save(_usuario), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
=======
	
>>>>>>> 9f1cb8653c7bc622e83af81f43e049eb81f1f6b3
}
