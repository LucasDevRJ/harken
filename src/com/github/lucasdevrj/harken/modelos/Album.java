package com.github.lucasdevrj.harken.modelos;

import com.github.lucasdevrj.harken.calculadora.Calcula;
import com.github.lucasdevrj.harken.classificacao.Classificavel;

import java.util.ArrayList;

public class Album implements Calcula {
    private String titulo;
    private int numeroDeMusicas = 0;

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
        System.out.println("Música " + musica.titulo + " adicionada no album!");
        this.listaMusicas.add(musica);
        this.numeroDeMusicas++;
        this.duracao += musica.duracao;
    }
    public void exibeInformacoes() {
        String informacoes = """
                Informações sobre o album
                Nome: %s
                Quantidade de Músicas: %d
                Duração: %d minutos
                Data: %s
                """.formatted(this.titulo, this.numeroDeMusicas, getDuracao(), this.data);
        System.out.println(informacoes);
    }

    public void exibeMusicasAlbum() {
        System.out.println("Músicas do album " + this.titulo);
        for (int i = 0; i < this.listaMusicas.size(); i++) {
            System.out.println(this.listaMusicas.get(i).titulo);
        }
    }

    @Override
    public int getDuracaoAudio() {
        return this.duracao;
    }
}
