package com.bandtec.techconnective.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bandtec.techconnective.dao.LoginRepository;
import com.bandtec.techconnective.model.Credenciais;

@CrossOrigin(origins = "*")
@RestController
public class LoginUsuarioController {
	
	private final LoginRepository loginRepository;
	
	@Autowired
	public LoginUsuarioController(LoginRepository loginRepository) {
		this.loginRepository = loginRepository;
	}
	
	@PostMapping("/login")
	public ResponseEntity<String> efetuarLogin(@RequestBody Credenciais credenciais) {
		ResponseEntity<String> resposta = ResponseEntity.ok("Sucesso");
		if(loginRepository.loginUsuario(credenciais) == null) {
			resposta = ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Login/senha não conferem");
		}
		return resposta;
	}
}
