package com.bandtec.techconnective.model;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "colUser")
public class Usuario {
	@Id
	private Integer id;

	@Getter private String nome;
	@Getter private String sobrenome;
	@Getter private String cpf;
	@JsonFormat(pattern = "dd/MM/yyyy")
	@Getter private LocalDate dt_nasc;
	@Getter @Setter private String email;
	@Getter @Setter private String login;
	@Getter @Setter private String senha;
	private Contato contato;
	private Endereco endereco;
	@Getter private char sexo;
	
	@Getter @Setter private List usuarioComum;
	
	
}
