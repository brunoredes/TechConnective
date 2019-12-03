package com.bandtec.techconnective.controller

import static org.junit.Assert.*

import org.mockito.Mockito
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

import com.bandtec.techconnective.dao.EmpresaRepository
import com.bandtec.techconnective.model.Empresa

import spock.lang.Specification

class EmpresaControllerTest extends Specification{
	
	def EmpresaRepository empresaRepository;
	def EmpresaController controller;
	

	public void setup() {
		empresaRepository = Mockito.mock(EmpresaRepository.class);
		controller = new EmpresaController(empresaRepository);
	}
	
	def "deve encontrar Empresa"(){
		given:
		List<Empresa> emp = new ArrayList<>();
		emp.add(new Empresa());
		Mockito.when(empresaRepository.findByNomeEmpresa("Empresa")).thenReturn(emp);

		when:
		ResponseEntity<List<Empresa>> resposta = controller.obterPorNome("Empresa");

		then:
		assertEquals(HttpStatus.OK, resposta.getStatusCode());
		assertEquals(emp, resposta.getBody());
	}
	def "não deve encontrar Empresa"(){
		given:
		List<Empresa> emp = new ArrayList<>();
		Mockito.when(empresaRepository.findByNomeEmpresa("Empresa")).thenReturn(emp);

		when:
		ResponseEntity<Empresa> resposta = controller.obterPorNome("Empresa");

		then:
		assertEquals(HttpStatus.NO_CONTENT, resposta.getStatusCode());
	}

}
