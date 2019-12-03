package com.bandtec.techconnective.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bandtec.techconnective.dao.DoacaoRepository;
import com.bandtec.techconnective.model.Doacao;
import com.bandtec.techconnective.model.Empresa;

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
	public ResponseEntity<List<Doacao>> list() {
		List<Doacao> lista = doacaoRepository.findAll();
		if (lista.isEmpty())
			return ResponseEntity.noContent().build();
		else
			return ResponseEntity.ok(lista);
	}
	
	@CrossOrigin
	@PostMapping("/doacao/criar")
	public ResponseEntity<String> cadastrarDoacao(@RequestBody Doacao doacao){
		doacaoRepository.save(doacao);
		return ResponseEntity.ok("Sucesso");
	}
	
	public ResponseEntity<List<Doacao>> list(@RequestBody Doacao doacao) {
		List<Doacao> lista = doacaoRepository.findAll();
		return lista.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(lista);

	}

}
