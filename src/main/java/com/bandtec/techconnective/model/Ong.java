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
	private Endereco endereco;
	private Contato contato;
	private Geolocalizacao geolocalizacao;

	public Ong() {
	}

	public Ong(String nomeInst, String cnpj, Credenciais credenciais,
			   Endereco endereco, Contato contato, Geolocalizacao geolocalizacao) {
		this.nomeInst = nomeInst;
		this.cnpj = cnpj;
		this.credenciais = credenciais;
		this.endereco = endereco;
		this.contato = contato;
		this.geolocalizacao = geolocalizacao;
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

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public String getId() {
		return id;
	}

	public void setNomeInst(String nomeInst) {
		this.nomeInst = nomeInst;
	}

	public Geolocalizacao getGeolocalizacao() {
		return geolocalizacao;
	}

	public void setGeolocalizacao(Geolocalizacao geolocalizacao) {
		this.geolocalizacao = geolocalizacao;
	}
}
