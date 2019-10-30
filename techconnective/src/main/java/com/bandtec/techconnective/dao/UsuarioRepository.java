package com.bandtec.techconnective.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.bandtec.techconnective.model.Usuario;

@Repository
public interface UsuarioRepository extends MongoRepository<Usuario, String>{
	
	@Query("{ 'login' : ?0, 'senha' : ?1}")
	public Usuario loginUsuario(String login, String senha);
	
	@Query("{'nome' : ?0}")
	public List<Usuario> porNome(String nome);


}
