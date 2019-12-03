package com.bandtec.techconnective.controller

import static org.junit.Assert.*

import org.junit.Test
import org.mockito.Mockito
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

import com.bandtec.techconnective.dao.DoacaoRepository
import com.bandtec.techconnective.model.Doacao

import spock.lang.Specification

class DoacaoControllerTest extends Specification{

	def DoacaoRepository doacaoRepository;
	def DoacaoController controller;
	
	@Test
	public void setup(){
		doacaoRepository = Mockito.mock(DoacaoRepository.class);
		controller = new DoacaoController(doacaoRepository);
	}
	
	def "deve pegar Doacao"(){
		
		given:
		Doacao doacao = new Doacao();
		List<Doacao> doa = new ArrayList<>();
		doa.add(doacao);
		Mockito.when(doacaoRepository.getAll(doacao)).thenReturn(doa);

		when:
		ResponseEntity<Doacao> resposta = controller.list(doacao);

		then:
		assertEquals(HttpStatus.OK, resposta.getStatusCode());
		assertEquals(doa, resposta.getBody());
	}
	
	def "não deve pegar Doacao"(){
		given:
		Doacao doacao = new Doacao();
		List<Doacao> doa = new ArrayList<>();
		Mockito.when(doacaoRepository.getAll(doacao)).thenReturn(doa);

		when:
		ResponseEntity<Doacao> resposta = controller.list(doacao);

		then:
		assertEquals(HttpStatus.NO_CONTENT, resposta.getStatusCode());

	}
	
	
}
