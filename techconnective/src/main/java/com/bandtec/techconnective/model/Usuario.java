package com.bandtec.techconnective.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Document("User")
@AllArgsConstructor
public class Usuario {
	@Id
	@Getter private Integer id;

	@Indexed(name = "infos")
	@Getter private String nome;
	@Getter @Setter private String email;
	@Getter @Setter private String login;
	@Getter @Setter private String senha;
	@Getter private String cpf;

	@JsonFormat(pattern = "dd-MM-yyyy")
	@Getter private LocalDate dt_nasc;

	@Getter @Setter private String cep;
	@Getter @Setter private Integer tel;
	@Getter @Setter private Integer cel;
	@Getter @Setter private int prefix;
	
	@Getter @Setter private List usuarioComum;
	
}
