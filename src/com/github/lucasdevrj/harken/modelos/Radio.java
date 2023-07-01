package com.github.lucasdevrj.harken.modelos;

import com.github.lucasdevrj.harken.calculadora.Calcula;

import java.util.ArrayList;

public class Radio extends Audio {

    private ArrayList<Estacao> listaEstacoes = new ArrayList<Estacao>();
    private int duracaoTotal = 0;

    public void adicionaEstacao(Estacao estacao) {
        System.out.println("A estação " + estacao.getTitulo() + " foi adicionada!!");
        this.listaEstacoes.add(estacao);
    }

    public void exibeEstacaoMaisTocada() {
        int estacaoMaisTocada = this.listaEstacoes.get(0).duracaoTotal;
        String nomeRadioMaisTocada = this.listaRadios.get(0).titulo;

        for (int i = 0; i < this.listaEstacoes.size(); i++) {
            if (this.listaEstacoes.get(i).duracaoTotal > estacaoMaisTocada) {
                estacaoMaisTocada = this.listaRadios.get(i).duracaoTotal;
                nomeRadioMaisTocada = this.listaRadios.get(i).titulo;
            }
        }

        System.out.println("Radio mais tocada: " + nomeRadioMaisTocada);
    }

    public void escutarEstacaoPorXMinutos(int minutos) {
        this.setDuracao(minutos);
        this.duracaoTotal += minutos;
        this.totalDeReproducoes++;
        System.out.println("Você escutou a radio " + this.titulo + " por " + minutos + " minutos.");
    }
}
