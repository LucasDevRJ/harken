package com.github.lucasdevrj.harken;

import com.github.lucasdevrj.harken.modelos.Audio;

public class CalculadoraDeTempo {
    private int duracaoTotal;

    public int getDuracaoTotal() {
        return duracaoTotal;
    }

    public void calculaDuracaoTotal(Audio audio) {
        this.duracaoTotal += audio.getDuracao();
    }
}
