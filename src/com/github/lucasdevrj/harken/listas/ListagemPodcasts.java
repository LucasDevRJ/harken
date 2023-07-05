package com.github.lucasdevrj.harken.listas;

import com.github.lucasdevrj.harken.modelos.Podcast;

import java.util.ArrayList;
import java.util.Collections;

public class ListagemPodcasts {

    private ArrayList<Podcast> listaPodcasts = new ArrayList<Podcast>();

    public void adiciona(Podcast podcast) {
        this.listaPodcasts.add(podcast);
        System.out.println("O Podcast " + podcast.getTitulo() + " foi adicionado!");
    }

    public void exibe() {
        System.out.println("Lista de podcast cadastrados:");
        Collections.sort(this.listaPodcasts);
        String informacoes = """
                Nome: %s
                Host: %s
                Convidade: %s
                
                """;
    }

    public void remove(Podcast podcast) {
        this.listaPodcasts.remove(podcast);
        System.out.println("O podcast " + podcast.getTitulo() + " foi removido!");
    }
}
