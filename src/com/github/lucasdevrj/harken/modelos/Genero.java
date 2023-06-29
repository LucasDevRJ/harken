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
}
