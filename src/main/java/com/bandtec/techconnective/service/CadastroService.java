package com.bandtec.techconnective.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bandtec.techconnective.model.Usuario;

@Service
public class CadastroService {
	private String url;
	private RestTemplate rest;

	public CadastroService() {
		this.rest = new RestTemplate();
		this.url = "localhost:8081";
	}
	// metodo

	public String cadastroUsuario(Usuario u) {
		String urlCad = this.url + "/usuario/criar";
		ResponseEntity<String> res = rest.postForEntity(urlCad, u, String.class);
		return res.getBody();

	}
}
