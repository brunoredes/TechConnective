package com.bandtec.techconnective.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.bandtec.techconnective.model.Credenciais;
import com.bandtec.techconnective.model.Empresa;
import com.bandtec.techconnective.model.Ong;

@Repository
public interface OngRepository extends MongoRepository<Ong, String>{

	public List<Ong> findByNomeInst(String nomeInst);
	
	@Query("{ 'credenciais' : ?0}")
	public Empresa loginOng(Credenciais c);
}
