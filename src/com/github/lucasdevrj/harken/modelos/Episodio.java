package com.github.lucasdevrj.harken.modelos;

public class Episodio {
    private String titulo;
    private String data;
    private int duracao;
    private String descricao;

    public Episodio(String titulo, String data, int duracao, String descricao) {
        this.titulo = titulo;
        this.data = data;
        this.duracao = duracao;
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
