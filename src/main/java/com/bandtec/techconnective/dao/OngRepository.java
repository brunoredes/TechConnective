package com.bandtec.techconnective.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bandtec.techconnective.model.Ong;

@Repository
public interface OngRepository extends MongoRepository<Ong, String>{

	public List<Ong> findByNomeInst(String nomeInst);
}
