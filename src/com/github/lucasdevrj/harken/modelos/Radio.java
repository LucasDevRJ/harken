package com.github.lucasdevrj.harken.modelos;

public class Radio extends Audio {
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
