package com.github.lucasdevrj.harken.modelos;

import com.github.lucasdevrj.harken.calculadora.Calcula;

import java.util.ArrayList;

public class Radio extends Audio {
    private int duracaoEscutadaTotal = 0;

    public int getDuracaoEscutadaTotal() {
        return duracaoEscutadaTotal;
    }

    public void escutarRadio(int minutos) {
        System.out.println("Você escutou a radio " + this.titulo);
        this.duracaoEscutadaTotal += minutos;
    }

    public void mudaRadio(Radio radio) {
        String radioDesejada = radio.titulo;
        System.out.println("Você mudou da radio " + this.titulo + " para a radio " + radioDesejada);
        this.titulo = radioDesejada;
    }

    public void exibeRadioAtual() {
        System.out.println("Você está escutando a radio " + this.titulo);
    }
}
