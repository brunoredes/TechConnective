package com.bandtec.techconnective.model;


import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor 
@Document(collection = "colUser")
public class Usuario {
	
	@Transient
    public static final String SEQUENCE_NAME = "DocSequence";
	
	@Id
	private long id;

	@Getter private String nome;
	@Getter private String cpf;
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Getter private LocalDate dt_nasc;
	//@Getter private String sobrenome;
	@Getter @Setter private Sex sex;
	//@Getter @Setter private String login;
	@Getter @Setter private String senha;
	@Getter @Setter private Endereco endereco;
	@Getter @Setter private Contato contato;
	@Getter @Setter private String email;
	
	//@Getter @Setter private List usuarioComum;
	
	public Usuario(String nome, String cpf, LocalDate dt_nasc, Sex sex, String senha, Endereco endereco, Contato contato, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.dt_nasc = dt_nasc;
		this.sex = sex;
		this.senha = senha;
		this.endereco = endereco;
		this.contato = contato;
		this.email = email;
	}
}
