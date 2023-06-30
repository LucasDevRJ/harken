package com.github.lucasdevrj.harken.calculadora;
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
