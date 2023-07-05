package com.github.lucasdevrj.harken.listas;

import com.github.lucasdevrj.harken.modelos.Musica;

import java.util.ArrayList;

public class ListagemMusica {
    private ArrayList<Musica> listaMusicas = new ArrayList<Musica>();

    public void adiciona(Musica musica) {
        this.listaMusicas.add(musica);
        System.out.println("A música " + musica.getTitulo() + " foi adicionada com sucesso!");
    }

    public void remove(Musica musica) {
        this.listaMusicas.remove(musica);
        System.out.println("A música " + musica.getTitulo() + " foi removida com sucesso!");
    }

    public void exibe() {
        System.out.println("Lista de músicas cadastradas:");
        this.listaMusicas.forEach(musica -> System.out.println(musica.getTitulo()));
    }
}
