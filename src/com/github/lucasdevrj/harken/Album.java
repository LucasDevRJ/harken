package com.github.lucasdevrj.harken;

import com.github.lucasdevrj.harken.modelos.Musica;

public class Album {
    private String nome;
    private int numeroDeMusicas;

    private int duracao;
    private String data;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionaMusica(Musica musica) {
        System.out.println("Música " + musica.getTitulo() + " adicionada no album!");
        this.numeroDeMusicas++;
        this.duracao += musica.getDuracao();
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
}
