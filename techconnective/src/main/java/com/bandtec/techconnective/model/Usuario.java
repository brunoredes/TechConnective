package com.bandtec.techconnective.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection = "colUser")
public class Usuario {

	@Id
	private String id;

	private String nome;
	private String cpf;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dt_nasc;
	// @Getter private String sobrenome;
	private Sex sex;
	private Credenciais credenciais;
	private Endereco endereco;
	private Contato contato;
	private Credenciais credenciais;

	public Usuario() {

	}

<<<<<<< HEAD
	public Usuario(String nome, String cpf, LocalDate dt_nasc, Sex sex, String senha, Endereco endereco,
			Contato contato, Credenciais credenciais) {
=======
	public Usuario(String nome, String cpf, LocalDate dt_nasc, Sex sex, Credenciais credenciais, Endereco endereco,
			Contato contato, String email) {
>>>>>>> 9f1cb8653c7bc622e83af81f43e049eb81f1f6b3
		this.nome = nome;
		this.cpf = cpf;
		this.dt_nasc = dt_nasc;
		this.sex = sex;
		this.credenciais = credenciais;
		this.endereco = endereco;
		this.contato = contato;
		this.credenciais = credenciais;
	}

	public String getId() {
		return id;
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

	public LocalDate getDt_nasc() {
		return dt_nasc;
	}

	public void setDt_nasc(LocalDate dt_nasc) {
		this.dt_nasc = dt_nasc;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
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

	public Credenciais getCredenciais() {
		return credenciais;
	}

	public void setCredenciais(Credenciais credenciais) {
		this.credenciais = credenciais;
	}

}
