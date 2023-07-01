package com.github.lucasdevrj.harken.modelos;

public class Estacao {
    private String titulo;
    private int duracaoTotalEscutada = 0;

    private int quantidadeOuvintes = 0;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracaoTotalEscutada() {
        return duracaoTotalEscutada;
    }

    public void escutarEstacao(int minutos) {
        this.duracaoTotalEscutada += minutos;
    }

    public void escutarEstacao() {
        System.out.println("Você está escutando " + this.titulo);
        this.quantidadeOuvintes++;
    }

    public void mudaEstacao(Estacao estacao) {
        String estacaoDesejada = estacao.titulo;
        if (!this.titulo.equals(estacaoDesejada)) {
            System.out.println("Trocou da estação " + this.titulo + " para " + estacaoDesejada);
            this.setTitulo(estacaoDesejada);
        } else {
            System.out.println("Já está na estação desejada!!");
        }
    }
}
