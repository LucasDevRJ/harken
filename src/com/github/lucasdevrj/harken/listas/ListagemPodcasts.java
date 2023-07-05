package com.github.lucasdevrj.harken.listas;

import com.github.lucasdevrj.harken.modelos.Podcast;

import java.util.ArrayList;

public class ListagemPodcasts {

    private ArrayList<Podcast> listaPodcasts = new ArrayList<Podcast>();

    public void adiciona(Podcast podcast) {
        this.listaPodcasts.add(podcast);
        System.out.println("O Podcast " + podcast.getTitulo() + " foi adicionado!");
    }
}
