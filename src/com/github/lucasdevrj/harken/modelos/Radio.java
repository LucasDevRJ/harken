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

    public void exibeRadioMaisTocada() {
        int radioMaisTocada = this.listaRadios.get(0).totalDeReproducoes;
        String nomeRadioMaisTocada = this.listaRadios.get(0).titulo;

        for (int i = 0; i < this.listaRadios.size(); i++) {
            if (this.listaRadios.get(i).totalDeReproducoes > radioMaisTocada) {
                radioMaisTocada = this.listaRadios.get(i).totalDeReproducoes;
                nomeRadioMaisTocada = this.listaRadios.get(i).titulo;
            }
        }

        System.out.println("Radio mais tocada: " + nomeRadioMaisTocada);
    }

    public void mudaEstacao(Radio radio) {
        String radioDesejada = radio.titulo;
        if (!this.titulo.equals(radioDesejada)) {
            System.out.println("Trocou da estação " + this.titulo + " para " + radioDesejada);
            this.setTitulo(radioDesejada);
            this.totalDeReproducoes++;
        } else {
            System.out.println("Já está na estação desejada!!");
        }
    }
}
