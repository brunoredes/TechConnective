package com.bandtec.techconnective.model;

import java.util.List;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
@Document(collection = "colEmpresa")

public class Empresa {
	@Id
	private int id;
	@Indexed(name = "infosOng")
	@Getter private String nome;
	@Getter private String email;
	@Getter @Setter private String senha;
	@Getter private String cnpj;
	@Getter private String cep;
	@Getter @Setter private String logradouro;
	@Getter @Setter private String bairro;
	@Getter private String cidade;
	@Getter private String uf;

	
	@Getter @Setter private List empresa;
	
	public Empresa(){
		
	}
	
	public Empresa(String nome, String email, String senha, String cnpj) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.cnpj = cnpj;
	}
}
