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
    private String dtInicio;
    private String dtFim;

    public Evento() {}

    public Evento(Endereco endereco, String descricao, Date data, String nomeOng, String dtInicio, String dtFim) {
        this.endereco = endereco;
        this.descricao = descricao;
        this.data = data;
        this.nomeOng = nomeOng;
        this.dtInicio = dtInicio;
        this.dtFim = dtFim;
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

    public String getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(String dtInicio) {
        this.dtInicio = dtInicio;
    }

    public String getDtFim() {
        return dtFim;
    }

    public void setDtFim(String dtFim) {
        this.dtFim = dtFim;
    }
}
