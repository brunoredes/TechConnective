package com.bandtec.techconnective.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bandtec.techconnective.dao.OngRepository;
import com.bandtec.techconnective.model.Ong;

@RequestMapping("/api")
@RestController
public class OngController {
	private OngRepository ongRepository;

	@Autowired
	public OngController(OngRepository ongRepository) {
		this.ongRepository = ongRepository;
	}

	@CrossOrigin
	@PostMapping("/ong/criar")
	public ResponseEntity<String> cadastrarOng(@RequestBody Ong ong) {
		ongRepository.save(ong);
		return ResponseEntity.ok("Sucesso");
	}

	@CrossOrigin
	@GetMapping("/procurar/ong/{nomeDaOng}")
	public ResponseEntity<List<Ong>> obterPorNome(@PathVariable("nomeDaOng") String nomeInst) {
		List<Ong> ongPorNome = ongRepository.findByNomeInst(nomeInst);
		return ongPorNome.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(ongPorNome);
	}

	@CrossOrigin
	@GetMapping("/ong/list")
	public ResponseEntity<List<Ong>> list(Ong ong) {
		List<Ong> lista = ongRepository.findAll();
		return lista.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(lista);
	}
}
