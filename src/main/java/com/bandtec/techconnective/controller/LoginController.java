package com.bandtec.techconnective.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bandtec.techconnective.dao.EmpresaRepository;
import com.bandtec.techconnective.dao.OngRepository;
import com.bandtec.techconnective.dao.UsuarioRepository;
import com.bandtec.techconnective.model.Credenciais;
import com.bandtec.techconnective.model.Empresa;
import com.bandtec.techconnective.model.Ong;
import com.bandtec.techconnective.model.Usuario;

@RequestMapping("/api")
@RestController
public class LoginController {

	private final UsuarioRepository usuarioRepository;
	private final OngRepository ongRepository;
	private final EmpresaRepository empresaRepository;

	@Autowired
	public LoginController(UsuarioRepository usuarioRepository, OngRepository ongRepository,
			EmpresaRepository empresaRepository) {
		this.usuarioRepository = usuarioRepository;
		this.ongRepository = ongRepository;
		this.empresaRepository = empresaRepository;
	}

	@CrossOrigin
	@PostMapping("/login/usuario")
	public ResponseEntity<String> efetuarLogin(@RequestBody Credenciais credenciais) {
		Usuario usr = usuarioRepository.loginUsuario(credenciais);
		return usr == null ? ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Login/senha não conferem")
				: ResponseEntity.ok("UIA");

	}

	@CrossOrigin
	@PostMapping("/login/empresa")
	public ResponseEntity<String> efetuaLogin(@RequestBody Credenciais credenciais) {
		Empresa empresa = empresaRepository.loginEmpresa(credenciais);
		return empresa == null ? ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Login/senha não conferem")
				: ResponseEntity.ok("UIA");
	}

	@CrossOrigin
	@PostMapping("/login/ong")
	public ResponseEntity<String> fazerLogin(@RequestBody Credenciais credenciais) {
		Ong ong = ongRepository.loginOng(credenciais);
		return ong == null ? ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Login/senha não conferem")
				: ResponseEntity.ok("UIA");
	}
}
