package com.bandtec.techconnective.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
	@Getter
	private long cep;
	@Getter@Setter
	private String logradouro;
	@Getter @Setter 
	private String numero;
	@Getter @Setter
	private String uf;
	@Getter @Setter
	private String cidade;
	@Getter @Setter
	private String bairro;
	@Getter @Setter
	private String complemento;
	@Getter @Setter
	private String ptRef;

}
