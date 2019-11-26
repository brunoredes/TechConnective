package com.bandtec.techconnective.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bandtec.techconnective.dao.DoacaoRepository;
import com.bandtec.techconnective.model.Doacao;

@RequestMapping("/api")
@RestController
public class DoacaoController {
	private DoacaoRepository doacaoRepository;

	@Autowired
	public DoacaoController(DoacaoRepository doacaoRepository) {
		this.doacaoRepository = doacaoRepository;
	}

	@CrossOrigin
	@GetMapping("/doacao")
	public ResponseEntity<List<Doacao>> list(@RequestBody Doacao doacao) {
		List<Doacao> lista = doacaoRepository.getAll(doacao);
		return lista.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(lista);

	}

}
