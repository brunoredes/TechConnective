package com.bandtec.techconnective.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.bandtec.techconnective.model.Usuario;

@Repository
public interface UsuarioRepository extends MongoRepository<Usuario, String>{
<<<<<<< HEAD
	
	@Query("{ 'cpf' : ?0, 'senha' : ?1}")
	public Usuario loginUsuario(String cpf, String senha);
	
	@Query("{'nome' : ?0}")
	public List<Usuario> porNome(String nome);
	
	
=======
	
	@Query("{'nome' : ?0}")
	public List<Usuario> porNome(String nome);
>>>>>>> 9f1cb8653c7bc622e83af81f43e049eb81f1f6b3

}
