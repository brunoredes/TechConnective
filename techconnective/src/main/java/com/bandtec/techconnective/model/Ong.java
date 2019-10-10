package com.bandtec.techconnective.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document("Ong")

public class Ong {
	@Id 
	private int id;
	
	@Indexed(name = "infosOng")
	@Getter private String nome;
	@Getter private String email;
	@Getter @Setter private String senha;
	@Getter private String cnpj;
	
	@Getter @Setter private List ong;
	
	public Ong() {

	}
	
	public Ong(String nome, String email, String senha, String cnpj) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.cnpj = cnpj;
	}
}
