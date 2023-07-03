package com.github.lucasdevrj.harken.principal;

import com.github.lucasdevrj.harken.listas.Listagem;
import com.github.lucasdevrj.harken.calculadora.Calculadora;
import com.github.lucasdevrj.harken.classificacao.Classificacao;
import com.github.lucasdevrj.harken.modelos.*;

public class Main {
    public static void main(String[] args) {
        Album album = new Album();
        album.setTitulo("Nevermind");
        album.setData("24/09/1991");

        Genero genero1 = new Genero();
        genero1.setTitulo("Rock");

        Genero genero2 = new Genero();
        genero2.setTitulo("Metal");

        Musica musica1 = new Musica("Something In The Way", 4, genero1,album);
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

        for (int i = 0; i < 5; i++) {
            musica1.reproduzir();
            System.out.println();
            musica1.curtir();
        }

        Musica musica2 = new Musica("Smells Like Teen Spirit", 5, genero1, album);
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

        for (int i = 0; i < 7; i++) {
            musica2.reproduzir();
        }

        for (int i = 0; i < 3; i++) {
            musica2.curtir();
        }

        Album album2 = new Album();
        album2.setTitulo("Appetite For Destruction");
        album2.setData("29/07/1987");

        Musica musica3 = new Musica("Paradise City", 6, genero2, album);
        musica3.setLetras("Take me down to the Paradise City\n" +
                "Where the grass is green and the girls are pretty\n" +
                "(Take me home) oh, won't you, please, take me home?\n" +
                "Take me down to the Paradise City\n" +
                "Where the grass is green and the girls are pretty\n" +
                "(Take me home) oh, won't you, please, take me home?\n" +
                "\n" +
                "Just an urchin living under the street\n" +
                "I'm a hard case that's tough to beat\n" +
                "I'm your charity case, so buy me something to eat\n" +
                "I'll pay you at another time\n" +
                "Take it to the end of the line\n" +
                "\n" +
                "Rags to riches, or so they say\n" +
                "You gotta keep pushing for the fortune and fame\n" +
                "You know it's, it's all a gamble when it's just a game\n" +
                "You treat it like a capital crime\n" +
                "Everybody's doing their time\n" +
                "\n" +
                "Take me down to the Paradise City\n" +
                "Where the grass is green and the girls are pretty\n" +
                "Oh, won't you, please, take me home, yeah, yeah?\n" +
                "Take me down to the Paradise City\n" +
                "Where the grass is green and the girls are pretty\n" +
                "Take me home\n" +
                "\n" +
                "Strapped in the chair of the city's gas chamber\n" +
                "Why I'm here, I can't quite remember\n" +
                "The surgeon general says it's hazardous to breathe\n" +
                "I'd have another cigarette, but I can't see\n" +
                "Tell me who you're gonna believe\n" +
                "\n" +
                "Take me down to the Paradise City\n" +
                "Where the grass is green and the girls are pretty\n" +
                "Take me home, yeah, yeah\n" +
                "Take me down to the Paradise City\n" +
                "Where the grass is green and the girls are pretty\n" +
                "Oh, won't you, please, take me home, yeah?\n" +
                "\n" +
                "So far away, so far away\n" +
                "So far away, so far away\n" +
                "\n" +
                "Captain America's been torn apart\n" +
                "Now he's a court jester with a broken heart\n" +
                "He said, turn me around and take me back to the start\n" +
                "I must be losing my mind, are you blind?\n" +
                "I've seen it all a million times\n" +
                "\n" +
                "Take me down to the Paradise City\n" +
                "Where the grass is green and the girls are pretty\n" +
                "Take me home, yeah, yeah\n" +
                "Take me down to the Paradise City\n" +
                "Where the grass is green and the girls are pretty\n" +
                "Oh, won't you, please, take me home?\n" +
                "\n" +
                "Take me down to the Paradise City\n" +
                "Where the grass is green and the girls are pretty\n" +
                "Take me home, yeah, yeah\n" +
                "Take me down to the Paradise City\n" +
                "Where the grass is green and the girls are pretty\n" +
                "Oh, won't you, please, take me home, home?\n" +
                "\n" +
                "Oh, I wanna go, I wanna know\n" +
                "Oh, won't you, please, take me home?\n" +
                "I wanna see how good it can be\n" +
                "Oh, won't you, please, take me home?\n" +
                "\n" +
                "Take me down to the Paradise City\n" +
                "Where the grass is green and the girls are pretty\n" +
                "(Take me home) oh, won't you please take me home?\n" +
                "Take me down to the Paradise City\n" +
                "Where the grass is green and the girls are pretty\n" +
                "Oh, won't you, please, take me home?\n" +
                "\n" +
                "Take me down (oh, yeah), spin me 'round\n" +
                "Oh, won't you, please, take me home?\n" +
                "I wanna see how good it can be\n" +
                "Oh, won't you, please, take me home?\n" +
                "\n" +
                "I wanna see how good it can be\n" +
                "Oh, oh, take me home\n" +
                "\n" +
                "Take me down to the Paradise City\n" +
                "Where the grass is green and the girls are pretty\n" +
                "Oh, won't you, please, take me home?\n" +
                "I wanna go, I wanna know\n" +
                "Oh, won't you, please, take me home?\n" +
                "Yeah, baby");
        musica3.setGenero(genero2);
        System.out.println();
        musica3.setAlbum(album2);

        for (int i = 0; i < 3; i++) {
            musica3.reproduzir();
            System.out.println();
            musica3.curtir();
        }

        album2.adicionaMusica(musica3);

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

        Radio radio1 = new Radio();
        radio1.setTitulo("89FM A Radio Rock");
        radio1.setDuracao(50);

        Radio radio2 = new Radio();
        radio2.setTitulo("Kiss FM 92.5");
        radio2.setDuracao(74);

        for (int i = 0; i < 3; i++) {
            radio1.reproduzir();
            radio1.curtir();
        }

        System.out.println();
        radio1.exibeInformacoes();
        System.out.println();
        radio2.exibeInformacoes();

        radio1.mudaRadio(radio2);
        System.out.println();
        radio1.setDuracao(34);
        System.out.println();
        radio1.reproduzir();
        System.out.println();
        radio1.exibeInformacoes();

        for (int i = 0; i < 3; i++) {
            podcast.reproduzir();
            System.out.println();
            podcast.curtir();
        }

        System.out.println();
        podcast.exibeInformacoes();

        Audio audio = new Audio();

        Calculadora calculadora = new Calculadora();
        calculadora.calculaDuracaoTotal(musica1);
        calculadora.calculaDuracaoTotal(musica2);
        calculadora.calculaDuracaoTotal(musica3);
        calculadora.calculaDuracaoTotal(podcast);
        System.out.println();

        System.out.println();
        audio.exibeDuracaoTotalEscutada(calculadora);
        System.out.println();

        genero1.adicionaMusica(musica1);
        System.out.println();
        genero1.adicionaMusica(musica2);
        System.out.println();
        genero1.exibeMusicasPeloGenero();
        System.out.println();

        genero2.adicionaMusica(musica3);
        System.out.println();
        genero2.exibeMusicasPeloGenero();
        System.out.println();
        musica3.exibeInformacoes();

        calculadora.calculaDuracaoTotal(musica3);
        audio.exibeDuracaoTotalEscutada(calculadora);
        System.out.println();
        album.exibeMusicasAlbum();

        System.out.println();
        //radio1.mudaEstacao(radio2);

        Calculadora calculadoraAlbum = new Calculadora();
        calculadoraAlbum.calculaDuracaoTotal(album);
        album.exibeInformacoes();
        System.out.println();

        Classificacao classificacao = new Classificacao();
        classificacao.adicionaAudio(musica1);
        classificacao.adicionaAudio(musica2);
        classificacao.adicionaAudio(podcast);
        classificacao.exibePosicao();

        Listagem listaAudios = new Listagem();
        listaAudios.adicionaAudio(musica1);
        listaAudios.adicionaAudio(podcast);
        listaAudios.adicionaAudio(musica2);
        listaAudios.adicionaAudio(musica3);
        listaAudios.exibeTodosAudios();
        listaAudios.removerAudio(musica1);
        System.out.println();
        listaAudios.exibeTodosAudios();
        System.out.println();
        //radio1.curtir();
        listaAudios.exibeAudiosCurtidos();
        System.out.println();
        album.exibeMusicaMaisCurtida();
        System.out.println();
    }
}
