package com.github.lucasdevrj.harken.principal;

import com.github.lucasdevrj.harken.modelos.Musica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Musica musica1 = new Musica();
        musica1.setTitulo("Something In The Way");
        musica1.setDuracao(4);
        musica1.setGenero("Rock");
        musica1.setLetras(
                "Underneath the bridge\n" +
                "Tarp has sprung a leak\n" +
                "And the animals I've trapped\n" +
                "Have all become my pets\n" +
                "And I'm living off of grass\n" +
                "And the drippings from my ceiling\n" +
                "It's okay to eat fish\n" +
                "Cause they don't have any feelings\n" +
                "Something in the way\n" +
                "Mmm-mmm\n" +
                "Something in the way, yeah\n" +
                "Mmm-mmm\n" +
                "Something in the way\n" +
                "Mmm-mmm\n" +
                "Something in the way, yeah\n" +
                "Mmm-mmm\n" +
                "Something in the way\n" +
                "Mmm-mmm\n" +
                "Something in the way, yeah\n" +
                "Mmm-mmm\n" +
                "Underneath the bridge\n" +
                "Tarp has sprung a leak\n" +
                "And the animals I've trapped\n" +
                "Have all become my pets\n" +
                "And I'm living off of grass\n" +
                "And the drippings from the ceiling\n" +
                "It's okay to eat fish\n" +
                "Cause they don't have any feelings\n" +
                "Something in the way\n" +
                "Mmm-mmm\n" +
                "Something in the way, yeah\n" +
                "Mmm-mmm\n" +
                "Something in the way\n" +
                "Mmm-mmm\n" +
                "Something in the way, yeah\n" +
                "Mmm-mmm\n" +
                "Something in the way\n" +
                "Mmm-mmm\n" +
                "Something in the way, yeah\n" +
                "Mmm-mmm\n" +
                "Something in the way\n" +
                "Mmm-mmm\n" +
                "Something in the way, yeah\n" +
                "Mmm-mmm");
        musica1.reproduzir();
        musica1.curtir();
        musica1.exibeInformacoes();
    }
}
