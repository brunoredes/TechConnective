package com.bandtec.techconnective.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "colEvento")
public class Evento {

    @Id
    private String id;

    private Endereco endereco;
    private String descricao;
    private Date data;
    private String nomeOng;

    public Evento() {}

    public Evento(Endereco endereco, String descricao, Date data, String nomeOng) {
        this.endereco = endereco;
        this.descricao = descricao;
        this.data = data;
        this.nomeOng = nomeOng;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getNomeOng() {
        return nomeOng;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
