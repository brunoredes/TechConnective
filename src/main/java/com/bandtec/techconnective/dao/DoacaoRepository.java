package com.bandtec.techconnective.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.bandtec.techconnective.model.Doacao;

public interface DoacaoRepository extends MongoRepository<Doacao, String>{

	List<Doacao> findAll();
}
