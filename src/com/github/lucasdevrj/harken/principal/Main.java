package com.github.lucasdevrj.harken.principal;

import com.github.lucasdevrj.harken.modelos.Musica;

public class Main {
    public static void main(String[] args) {
        Musica musica1 = new Musica();
        musica1.setTitulo("Something In The Way");
        musica1.setDuracao(4);

        musica1.reproduzir();
    }
}
