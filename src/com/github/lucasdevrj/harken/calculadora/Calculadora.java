package com.github.lucasdevrj.harken.calculadora;

import com.github.lucasdevrj.harken.modelos.Musica;

public class Calculadora {
    private int duracaoTotal;
    public int getDuracaoTotal() {
        return duracaoTotal;
    }
    public int calculaDuracaoTotal(Calcula audio) {
        this.duracaoTotal += audio.getDuracaoAudio();
        return this.duracaoTotal;
    }
}
