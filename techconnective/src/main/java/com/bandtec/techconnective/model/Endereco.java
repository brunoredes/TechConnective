package com.bandtec.techconnective.model;

public class Endereco {

	private long cep;

	private String logradouro;

	private String numero;

	private Uf uf;

	private String cidade;

	private String bairro;

	private String complemento;

	private String ptRef;
	
	public Endereco() {}

	public Endereco(long cep, String logradouro, String numero, Uf uf, String cidade, String bairro, String complemento,
			String ptRef) {
		this.cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
		this.uf = uf;
		this.cidade = cidade;
		this.bairro = bairro;
		this.complemento = complemento;
		this.ptRef = ptRef;
	}

	public long getCep() {
		return cep;
	}

	public void setCep(long cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Uf getUf() {
		return uf;
	}

	public void setUf(Uf uf) {
		this.uf = uf;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getPtRef() {
		return ptRef;
	}

	public void setPtRef(String ptRef) {
		this.ptRef = ptRef;
	}

}
