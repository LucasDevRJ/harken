package com.github.lucasdevrj.harken.modelos;

public class Episodio {
    private String titulo;
    private String data;
    private int duracao;
    private String descricao;
    private Podcast podcast;

    public Episodio(String titulo, String data, int duracao, Podcast podcast) {
        this.titulo = titulo;
        this.data = data;
        this.duracao = duracao;
        this.podcast = podcast;
    }
    public String getTitulo() {
        return titulo;
    }

    public String getData() {
        return data;
    }

    public int getDuracao() {
        return duracao;
    }

    public Podcast getPodcast() {
        return podcast;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
