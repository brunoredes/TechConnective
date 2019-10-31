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

import com.bandtec.techconnective.dao.EmpresaRepository;
import com.bandtec.techconnective.model.Empresa;

@CrossOrigin(origins = "*")
@RequestMapping("/api")
@RestController
public class EmpresaController {
	private EmpresaRepository empresaRepository;
	
	@Autowired
	public EmpresaController(EmpresaRepository empresaRepository) {
		this.empresaRepository = empresaRepository;
	}
	
	@CrossOrigin
	@PostMapping("/empresa/criar")
	public ResponseEntity<String> cadastrarUsuario(@RequestBody Empresa empresa){
		empresaRepository.save(empresa);
		return ResponseEntity.ok("Sucesso");
	}
	
	@GetMapping("/procurar/empresa")
	public ResponseEntity<List<Empresa>> obterPorNome(@PathVariable("nomeDaEmpresa") String nomeEmpresa) {
		List<Empresa> empresaPorNome = empresaRepository.porNome(nomeEmpresa);
		if(empresaPorNome.isEmpty()) return ResponseEntity.noContent().build();
		else return ResponseEntity.ok(empresaPorNome);
	}
	
}
