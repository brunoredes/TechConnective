package com.bandtec.techconnective.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor
public class Endereco {
	@Getter private String cep;
	@Getter @Setter private String logradouro;
	@Getter @Setter private String bairro;
	@Getter private String cidade;
	@Getter private String uf;
}
