package com.github.lucasdevrj.harken.classificacao;

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
}
