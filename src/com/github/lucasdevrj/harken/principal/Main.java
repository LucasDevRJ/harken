package com.github.lucasdevrj.harken.principal;

import com.github.lucasdevrj.harken.calculadora.Calculadora;
import com.github.lucasdevrj.harken.modelos.Album;
import com.github.lucasdevrj.harken.modelos.Audio;
import com.github.lucasdevrj.harken.modelos.Musica;
import com.github.lucasdevrj.harken.modelos.Podcast;

public class Main {
    public static void main(String[] args) {
        Album album = new Album();
        album.setNome("Nevermind");
        album.setData("24/09/1991");

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
        System.out.println();
        musica1.curtir();
        System.out.println();
        //musica1.exibirLetras();
        musica1.exibePosicao();
        System.out.println();

        Musica musica2 = new Musica();
        musica2.setTitulo("Smells Like Teen Spirit");
        musica2.setDuracao(5);
        musica2.setGenero("Rock");
        musica2.setLetras("Load up on guns, bring your friends\n" +
                "It's fun to lose and to pretend\n" +
                "She's over-bored and self-assured\n" +
                "Oh no, I know a dirty word\n" +
                "Hello, hello, hello, how low\n" +
                "Hello, hello, hello, how low\n" +
                "Hello, hello, hello, how low\n" +
                "Hello, hello, hello\n" +
                "With the lights out, it's less dangerous\n" +
                "Here we are now, entertain us\n" +
                "I feel stupid, and contagious\n" +
                "Here we are now, entertain us\n" +
                "A mulatto, an albino\n" +
                "A mosquito, my libido\n" +
                "Yeah, hey, yay\n" +
                "I'm worse at what I do best\n" +
                "And for this gift, I feel blessed\n" +
                "Our little group has always been\n" +
                "And always will until the end\n" +
                "Hello, hello, hello, how low\n" +
                "Hello, hello, hello, how low\n" +
                "Hello, hello, hello, how low\n" +
                "Hello, hello, hello\n" +
                "With the lights out, it's less dangerous\n" +
                "Here we are now, entertain us\n" +
                "I feel stupid, and contagious\n" +
                "Here we are now, entertain us\n" +
                "A mulatto, an albino\n" +
                "A mosquito, my libido\n" +
                "Yeah, hey, yay\n" +
                "And I forget, just why I taste\n" +
                "Oh yeah, I guess it makes me smile\n" +
                "I found it hard, it's hard to find\n" +
                "Oh well, whatever, never mind\n" +
                "Hello, hello, hello, how low?\n" +
                "Hello, hello, hello, how low?\n" +
                "Hello, hello, hello, how low?\n" +
                "Hello, hello, hello\n" +
                "With the lights out, it's less dangerous\n" +
                "Here we are now, entertain us\n" +
                "I feel stupid, and contagious\n" +
                "Here we are now, entertain us\n" +
                "A mulatto, an albino\n" +
                "A mosquito, my libido\n" +
                "A denial, a denial\n" +
                "A denial, a denial\n" +
                "A denial, a denial\n" +
                "A denial, a denial\n" +
                "A denial");

        musica2.reproduzir();
        System.out.println();
        musica2.curtir();
        System.out.println();
        musica2.exibePosicao();
        System.out.println();

        album.adicionaMusica(musica1);
        System.out.println();
        album.adicionaMusica(musica2);
        System.out.println();
        album.exibeInformacoes();

        musica1.setAlbum(album);
        musica2.setAlbum(album);

        musica1.exibeInformacoes();
        System.out.println();
        musica2.exibeInformacoes();

        Podcast podcast = new Podcast();
        podcast.setTitulo("Hipsters Ponto Tech");
        podcast.setDescricao("Discussões sobre tecnologia, programação, design, startups e as últimas tendências.");
        podcast.setDuracao(41);
        podcast.setHost("Paulo Silveira");
        podcast.setConvidado("Alaydes Morais");
        podcast.reproduzir();
        System.out.println();
        podcast.curtir();
        System.out.println();
        podcast.exibeInformacoes();

        Audio audio = new Audio();

        Calculadora calculadora = new Calculadora();
        calculadora.calculaDuracaoTotal(musica1);
        calculadora.calculaDuracaoTotal(musica2);
        calculadora.calculaDuracaoTotal(podcast);

        System.out.println();
        audio.exibeDuracaoTotalEscutada(calculadora);
    }
}
