package com.bandtec.techconnective.model;

public class Endereco {
	private String cidade;
	private String bairro;
	private String estado;
	private String cep;

	public Endereco() {
		this("","","","");
	}

	public Endereco(String cidade, String bairro, String estado, String cep) {
		this.setCidade(cidade);
		this.setBairro(bairro);
		this.setEstado(estado);
		this.setCep(cep);
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

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
}
