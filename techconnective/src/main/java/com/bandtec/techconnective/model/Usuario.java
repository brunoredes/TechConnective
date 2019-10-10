package com.bandtec.techconnective.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "colUser")

public class Usuario {
	@Id
	private Integer id;

	@Indexed(name = "infos")
	@Getter private String nome;
	@Getter @Setter private String email;
	@Getter @Setter private String login;
	@Getter @Setter private String senha;
	@Getter private String cpf;

	@JsonFormat(pattern = "dd/MM/yyyy")
	@Getter private LocalDate dt_nasc;
	@Getter private String cep;
	@Getter @Setter private String logradouro;
	@Getter @Setter private String bairro;
	@Getter private String cidade;
	@Getter private String uf;
	@Getter @Setter private Integer tel;
	@Getter @Setter private Integer cel;
	@Getter @Setter private int prefix;
	@Getter private char sexo;
	@Getter private String role = "admin";
	
	@Getter @Setter private List usuarioComum;
	
	
}
