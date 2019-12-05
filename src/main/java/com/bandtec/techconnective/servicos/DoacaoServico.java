package com.bandtec.techconnective.servicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.bandtec.techconnective.dao.DoacaoRepository;
import com.bandtec.techconnective.model.Doacao;

@Service
public class DoacaoServico {
	
	@Autowired	
	private DoacaoRepository repo;
	
	public Page<Doacao> findPage(Integer page, Integer linesPerPage, String orderBy, String direction){
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		return repo.findAll(pageRequest);
	}

}
