package com.bandtec.techconnective.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "colDoacao")
public class Doacao {

	@Id
	private String id;

	private String tipo;
	private String nomeOng;
	private String descricao;
	private Integer qnt;
	private Date validade;
	private String comentario;
	
	public Doacao(){}
	
	public Doacao(String id, String tipo, String nomeOng, String descricao, Integer qnt, Date validade,
			String comentario) {
		this.id = id;
		this.tipo = tipo;
		this.nomeOng = nomeOng;
		this.descricao = descricao;
		this.qnt = qnt;
		this.validade = validade;
		this.comentario = comentario;
	}
	public String getId() {return id;}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNomeOng() {
		return nomeOng;
	}
	public void setNomeOng(String nomeOng) {
		this.nomeOng = nomeOng;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Integer getQnt() {
		return qnt;
	}
	public void setQnt(Integer qnt) {
		this.qnt = qnt;
	}
	public Date getValidade() {
		return validade;
	}
	public void setValidade(Date validade) {
		this.validade = validade;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	
}
