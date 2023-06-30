package com.github.lucasdevrj.harken.modelos;

import java.util.ArrayList;

public class Radio extends Audio {

    private ArrayList<Radio> listaRadios = new ArrayList<Radio>();

    public ArrayList<Radio> getListaRadios() {
        return listaRadios;
    }

    public void adicionaRadio(Radio radio) {
        System.out.println("A estação " + radio.titulo + " foi adicionada!!");
        this.listaRadios.add(radio);
    }

    public void mudaEstacao(Radio radio) {
        String radioDesejada = radio.titulo;
        if (!this.titulo.equals(radioDesejada)) {
            System.out.println("Trocou da estação " + this.titulo + " para " + radioDesejada);
            this.setTitulo(radioDesejada);
        } else {
            System.out.println("Já está na estação desejada!!");
        }
    }
}
