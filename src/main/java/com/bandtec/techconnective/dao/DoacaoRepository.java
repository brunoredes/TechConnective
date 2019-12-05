package com.bandtec.techconnective.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.bandtec.techconnective.model.Doacao;

public interface DoacaoRepository extends MongoRepository<Doacao, String>{

	List<Doacao> findAll();
	

	

}
