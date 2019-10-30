package com.bandtec.techconnective.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.bandtec.techconnective.model.Credenciais;
import com.bandtec.techconnective.model.Empresa;

public interface EmpresaRepository extends MongoRepository<Empresa, String>{
	
	@Query("{ 'credenciais' : {'login':?0,'senha':?0}}")
	public Empresa loginEmpresa(Credenciais credenciais);
	
	@Query("{'nomeEmpresa' : ?0}")
	public List<Empresa> porNome(String nomeEmpresa);
}
