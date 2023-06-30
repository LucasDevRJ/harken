package com.github.lucasdevrj.harken.modelos;

import java.util.ArrayList;

public class Genero {
    private String nome;
    private ArrayList<Musica> listaMusicas = new ArrayList<Musica>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionaMusica(Musica musica) {
        String generoDesejado = musica.getGenero().nome;
        if (generoDesejado.equals(this.getNome())) {
            this.listaMusicas.add(musica);
            System.out.println("A música " + musica.getTitulo() + " foi adicionada ao genero " + this.nome);
        } else {
            System.out.println("Genêros diferentes!!");
        }
    }

    public void exibeMusicasPeloGenero() {
        System.out.println("Lista de músicas com o genero de " + this.nome);
        int tamanhoDaLista = this.listaMusicas.size();
        for (int i = 0; i < tamanhoDaLista; i++) {
            System.out.println(this.listaMusicas.get(i).getNome());
        }
    }
}
