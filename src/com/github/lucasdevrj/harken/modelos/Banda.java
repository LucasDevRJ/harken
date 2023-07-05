package com.github.lucasdevrj.harken.modelos;

import java.util.ArrayList;

public class Banda {
    private String titulo;
    private ArrayList<Album> albuns = new ArrayList<Album>();
    private Genero genero;

    public Banda(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void adicionaAlbum(Album album) {
        this.albuns.add(album);
        System.out.println("O album " + album.getNome() + " foi adicionado com sucesso!");
    }
}
