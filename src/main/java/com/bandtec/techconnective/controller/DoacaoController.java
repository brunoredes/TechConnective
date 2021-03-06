package com.bandtec.techconnective.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.bandtec.techconnective.dao.DoacaoRepository;
import com.bandtec.techconnective.model.Doacao;
import com.bandtec.techconnective.servicos.DoacaoServico;

@RequestMapping("/api")
@RestController
public class DoacaoController {
	private DoacaoRepository doacaoRepository;

	@Autowired
	private DoacaoServico service;
	
	@Autowired
	public DoacaoController(DoacaoRepository doacaoRepository) {
		this.doacaoRepository = doacaoRepository;
	}

	@CrossOrigin
	@PostMapping("/doacao/criar")
	public ResponseEntity<String> cadastrarDoacao(@RequestBody Doacao doacao) {
		doacaoRepository.save(doacao);
		return ResponseEntity.ok("Sucesso");
	}
	
	@CrossOrigin
	@GetMapping("/doacao/list")
	public ResponseEntity<List<Doacao>> list(Doacao doacao){
		List<Doacao> lista = doacaoRepository.findAll();
		return ResponseEntity.ok().body(lista);
	}

	@GetMapping("/doacao/{id}")
	public ResponseEntity<Optional<Doacao>> listById (@PathVariable("id") String id) {
		Optional<Doacao> porId = doacaoRepository.findById(id);
		return ResponseEntity.ok(porId);
	}


	@CrossOrigin
	@GetMapping("/doacao/page")
	public ResponseEntity<Page<Doacao>> findPage(
			@RequestParam(value = "page", defaultValue = "0")Integer page,
			@RequestParam(value = "linesPerPage", defaultValue = "24") Integer linesPerPage,
			@RequestParam(value = "orderBy", defaultValue = "nomeOng")String orderBy,
			@RequestParam(value = "direction",defaultValue = "DESC")String direction){
		Page<Doacao> list = service.findPage(page, linesPerPage, orderBy, direction);
		
		return ResponseEntity.ok().body(list);
	}

}
