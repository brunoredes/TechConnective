package com.bandtec.techconnective.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "colEmpresa")
public class Empresa {
	@Id
	private String id;

	private String nomeEmpresa;
	private String razSoc;
	private String cnpj;
	private Credenciais credenciais;
	private Endereco endereco;
	private Contato contato;
	
	public Empresa(){}

	public Empresa(String nomeEmpresa, String razSoc, String cnpj, Credenciais credenciais, Endereco endereco, Contato contato) {
		this.nomeEmpresa = nomeEmpresa;
		this.razSoc = razSoc;
		this.cnpj = cnpj;
		this.credenciais = credenciais;
		this.endereco = endereco;
		this.contato = contato;
	}


	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getRazSoc() {
		return razSoc;
	}

	public void setRazSoc(String razSoc) {
		this.razSoc = razSoc;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Credenciais getCredenciais() {
		return credenciais;
	}

	public void setCredenciais(Credenciais credenciais) {
		this.credenciais = credenciais;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}
	
}
