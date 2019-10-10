package com.bandtec.techconnective.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.bandtec.techconnective.model.Usuario;

@Repository
public interface UsuarioRepository extends MongoRepository{
	
	@Query
	(value = "{'employees.name': ?0}", fields = "{'employees' : 0}")
	public Usuario buscarUsuario(@Param(""))
	
	List

}
