package com.github.lucasdevrj.harken.modelos;

import java.util.ArrayList;

public class Album {
    private String titulo;
    private int numeroDeMusicas;

    private ArrayList<Musica> listaMusicas = new ArrayList<Musica>();
    private int duracao;
    private String data;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroDeMusicas() {
        return numeroDeMusicas;
    }

    public int getDuracao() {
        return duracao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void adicionaMusica(Musica musica) {
        System.out.println("Música " + musica.getTitulo() + " adicionada no album!");
        this.listaMusicas.add(musica);
        this.duracao += musica.getDuracao();
    }
    public void exibeInformacoes() {
        String informacoes = """
                Informações sobre o album
                Nome: %s
                Quantidade de Músicas: %d
                Duração: %d minutos
                Data: %s
                """.formatted(this.titulo, this.numeroDeMusicas, this.duracao, this.data);
        System.out.println(informacoes);
    }
}
