package com.github.lucasdevrj.harken.classificacao;

import com.github.lucasdevrj.harken.modelos.Audio;

public class Classificacao {
    public void exibePosicao(Classificavel audio) {
        if (audio.getClassificacao() < 3) {
            System.out.println(audio.getNome() + " está entre as 3 mais tocadas!!");
        } else if (audio.getClassificacao() < 5) {
            System.out.println(audio.getNome()+ " está entre as 5 mais tocadas!!");
        } else if (audio.getClassificacao() < 10) {
            System.out.println(audio.getNome() + " está entre as 10 mais tocadas!!");
        }
    }

    public void exibeAsTresMaisCurtidas(Audio audio1, Audio audio2, Audio audio3) {
        System.out.println("As três mais curtidas do momento:");

        int trocaCurtidas = 0;
        String trocaTitulo = "";

        int maiorNumeroCurtidas = audio1.getCurtidas();
        String tituloPrimeiroColocado = audio1.getTitulo();

        int segundoMaiorNumeroCurtidas = audio2.getCurtidas();
        String tituloSegundoColocado = audio2.getTitulo();

        int terceiroMaiorNumeroCurtidas = audio3.getCurtidas();
        String tituloTerceiroColocado = audio3.getTitulo();

        if (maiorNumeroCurtidas < segundoMaiorNumeroCurtidas) {
            maiorNumeroCurtidas = segundoMaiorNumeroCurtidas;
            tituloPrimeiroColocado = tituloSegundoColocado;
        }

        if (maiorNumeroCurtidas < terceiroMaiorNumeroCurtidas) {
            maiorNumeroCurtidas = terceiroMaiorNumeroCurtidas;
            tituloPrimeiroColocado = tituloTerceiroColocado;
        }

        if (segundoMaiorNumeroCurtidas < terceiroMaiorNumeroCurtidas) {
            trocaTitulo = tituloSegundoColocado;
            trocaCurtidas = segundoMaiorNumeroCurtidas;

            segundoMaiorNumeroCurtidas = terceiroMaiorNumeroCurtidas;
            tituloSegundoColocado = tituloTerceiroColocado;

            terceiroMaiorNumeroCurtidas = trocaCurtidas;
            tituloTerceiroColocado = trocaTitulo;
        }

        System.out.println(tituloPrimeiroColocado);
        System.out.println(tituloSegundoColocado);
        System.out.println(tituloTerceiroColocado);
    }
}
