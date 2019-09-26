package com.bandtec.techconnective.model;

import java.util.Calendar;

import org.springframework.format.annotation.DateTimeFormat;

public class Usuario {
	private String nome;
	private String cpf;
	private String cnpj;
	private int idade;
	private Endereco endereco;
	private String perfil;

	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Calendar dataNascimento;

	public Usuario() {
		this("", "", "", 0, null, null, null);
	}

	public Usuario(String nome, String cpf, String cnpj, int idade, Endereco endereco, String perfil,
			Calendar dataNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.cnpj = cnpj;
		this.idade = idade;
		this.endereco = endereco;
		this.perfil = perfil;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}
