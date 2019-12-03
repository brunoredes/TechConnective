package com.bandtec.techconnective.controller

import static org.junit.Assert.*

import org.mockito.Mockito
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

import com.bandtec.techconnective.dao.EmpresaRepository
import com.bandtec.techconnective.dao.OngRepository
import com.bandtec.techconnective.dao.UsuarioRepository
import com.bandtec.techconnective.model.Credenciais
import com.bandtec.techconnective.model.Empresa
import com.bandtec.techconnective.model.Ong
import com.bandtec.techconnective.model.Usuario

import spock.lang.Specification

class LoginControllerTests extends Specification{

	def LoginController controller;
	def UsuarioRepository usuarioRepository;
	def OngRepository ongRepository;
	def EmpresaRepository empresaRepository;
	
	public void setup(){
		usuarioRepository = Mockito.mock(UsuarioRepository.class);
		ongRepository =  Mockito.mock(OngRepository.class);
		empresaRepository = Mockito.mock(EmpresaRepository.class);
		controller = new LoginController(usuarioRepository,ongRepository ,empresaRepository );
			
	}

	def "logar Usuario"(){
		given:
		Usuario usr = new Usuario();
		Credenciais c = new Credenciais("teste","teste");
		Mockito.when(usuarioRepository.loginUsuario(c)).thenReturn(usr);

		when:
		ResponseEntity<Usuario> resposta = controller.efetuarLogin(c);

		then:
		assertEquals(HttpStatus.OK, resposta.getStatusCode());
		assertEquals(usr, resposta.getBody());
	}
	def "nao Logar Usuario"(){
		given:
		Credenciais c = new Credenciais("teste","teste");
		Mockito.when(usuarioRepository.loginUsuario(c)).thenReturn(null);

		when:
		ResponseEntity<Usuario> resposta = controller.efetuarLogin(c);

		then:
		assertEquals(HttpStatus.UNAUTHORIZED, resposta.getStatusCode());
	}
	
	
	
	def "logar Empresa"(){
		given:
		Empresa emp = new Empresa();
		Credenciais c = new Credenciais("teste","teste");
		Mockito.when(empresaRepository.loginEmpresa(c)).thenReturn(emp);

		when:
		ResponseEntity<Empresa> resposta = controller.efetuaLogin(c);

		then:
		assertEquals(HttpStatus.OK, resposta.getStatusCode());
		assertEquals(emp, resposta.getBody());
	}
	
	def "nao Logar Empresa"(){
		given:
		Credenciais c = new Credenciais("teste","teste");
		Mockito.when(empresaRepository.loginEmpresa(c)).thenReturn(null);

		when:
		ResponseEntity<Empresa> resposta = controller.efetuaLogin(c);

		then:
		assertEquals(HttpStatus.UNAUTHORIZED, resposta.getStatusCode());
	}
	
	
	
	def "logar Ong"(){
		given:
		Ong ong = new Ong();
		Credenciais c = new Credenciais("teste","teste");
		Mockito.when(ongRepository.loginOng(c)).thenReturn(ong);

		when:
		ResponseEntity<Ong> resposta = controller.fazerLogin(c);

		then:
		assertEquals(HttpStatus.OK, resposta.getStatusCode());
		assertEquals(ong, resposta.getBody());
	}
	
	def "nao Logar Ong"(){
		given:
		Credenciais c = new Credenciais("teste","teste");
		Mockito.when(ongRepository.loginOng(c)).thenReturn(null);

		when:
		ResponseEntity<Ong> resposta = controller.fazerLogin(c);

		then:
		assertEquals(HttpStatus.UNAUTHORIZED, resposta.getStatusCode());
	}
}
