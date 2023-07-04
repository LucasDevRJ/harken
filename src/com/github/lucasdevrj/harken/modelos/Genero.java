package com.github.lucasdevrj.harken.modelos;

import java.util.ArrayList;

public class Genero {
    private String titulo;
    private ArrayList<Musica> listaMusicas = new ArrayList<Musica>();

    public Genero(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void adicionaMusica(Musica musica) {
        String generoDesejado = musica.getGenero().titulo;
        if (generoDesejado.equals(this.getTitulo())) {
            this.listaMusicas.add(musica);
            System.out.println("A música " + musica.getTitulo() + " foi adicionada ao genero " + this.titulo);
        } else {
            System.out.println("Genêros diferentes!!");
        }
    }

    public void exibeMusicasPeloGenero() {
        System.out.println("Lista de músicas com o genero de " + this.titulo);
        int tamanhoDaLista = this.listaMusicas.size();
        for (int i = 0; i < tamanhoDaLista; i++) {
            System.out.println(this.listaMusicas.get(i).getNome());
        }
    }
}
