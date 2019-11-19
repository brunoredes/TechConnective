package com.bandtec.techconnective.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.bandtec.techconnective.model.Credenciais;
import com.bandtec.techconnective.model.Empresa;

public interface EmpresaRepository extends MongoRepository<Empresa, String>{
	
	@CrossOrigin
	@Query("{ 'credenciais' : ?0}")
	public Empresa loginEmpresa(Credenciais c);
	
	@Query("{'nomeEmpresa' : ?0}")
	public List<Empresa> findByNomeEmpresa(String nomeEmpresa);
}
