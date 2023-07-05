package com.github.lucasdevrj.harken.modelos;

import com.github.lucasdevrj.harken.calculadora.Calcula;
import com.github.lucasdevrj.harken.calculadora.Calculadora;

import java.util.ArrayList;

public class Radio extends Audio {
    private int duracaoEscutadaTotal = 0;
    private int quantidadeOuvintes = 0;

    public Radio(String titulo, int duracaoEscutadaTotal) {
        super(titulo, duracaoEscutadaTotal);
    }

    public int getDuracaoEscutadaTotal() {
        return duracaoEscutadaTotal;
    }

    public int getQuantidadeOuvintes() {
        return quantidadeOuvintes;
    }

    @Override
    public void reproduzir() {
        System.out.println("Você escutou a radio " + this.titulo);
        this.duracaoEscutadaTotal += this.duracao;
        this.quantidadeOuvintes++;
    }

    public void mudaRadio(Radio radio) {
        this.quantidadeOuvintes--;
        String radioDesejada = radio.titulo;
        System.out.println("Você mudou da radio " + this.titulo + " para a radio " + radioDesejada);
        radio.quantidadeOuvintes++;
        this.titulo = radioDesejada;
    }

    public void exibeRadioAtual() {
        System.out.println("Você está escutando a radio " + this.titulo);
    }

    @Override
    public void exibeDuracaoTotalEscutada(Calculadora duracao) {
        System.out.println("A radio " + this.titulo + " foi escutada por " + this.duracaoEscutadaTotal + " de minutos no total.");
    }

    @Override
    public void exibeInformacoes() {
        String informacoes = """
                Nome: %s
                Duração Atual Escutada: %d minutos
                Curtidas: %d
                Duração Total Escutada: %d minutos
                Quantidade de Ouvintes: %d
                """.formatted(this.titulo, this.duracao, this.getCurtidas(), this.duracaoEscutadaTotal, this.quantidadeOuvintes);
        System.out.println(informacoes);
    }
}
