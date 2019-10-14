package com.bandtec.techconnective.common;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.bandtec.techconnective.model.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, Integer>{
	
	@Query("{ 'nome' : ?0, 'senha' : ?0}")
	List<Usuario> loginUsuario(String nome, String senha);
	
	@Query("{'nome' : ?0}")
	List<Usuario> porNome(String nome);
}
