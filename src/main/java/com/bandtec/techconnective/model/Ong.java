package com.bandtec.techconnective.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("colOng")

public class Ong {
	@Id
	private String id;
	private String nomeInst;
	private Credenciais credenciais;
	private String cnpj;
	private Uf uf;
	private Endereco endereco;
	private Contato contato;
	private String url;

	public Ong() {
	}

	public Ong(String nomeInst, String cnpj, Credenciais credenciais, Uf uf, Endereco endereco, Contato contato,
			String url) {
		this.nomeInst = nomeInst;
		this.cnpj = cnpj;
		this.credenciais = credenciais;
		this.uf = uf;
		this.endereco = endereco;
		this.contato = contato;
		this.url = url;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getNomeInst() {
		return nomeInst;
	}

	public Credenciais getCredenciais() {
		return credenciais;
	}

	public void setCredenciais(Credenciais credenciais) {
		this.credenciais = credenciais;
	}

	public String getCnpj() {
		return cnpj;
	}

	public Uf getUf() {
		return uf;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public String getUrl() {
		return url;
	}

}
