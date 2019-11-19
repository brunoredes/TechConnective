package com.bandtec.techconnective.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.bandtec.techconnective.model.Credenciais;
import com.bandtec.techconnective.model.Usuario;

@Repository
public interface LoginRepository extends MongoRepository<Usuario, String>{
	
	@CrossOrigin
	@Query("{ 'credenciais' : ?0}")
	public Usuario loginUsuario(Credenciais c);
}
