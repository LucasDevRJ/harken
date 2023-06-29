package com.github.lucasdevrj.harken.modelos;

import com.github.lucasdevrj.harken.CalculadoraDeTempo;
import com.github.lucasdevrj.harken.classificacao.Classificavel;

public class Audio implements Classificavel {
    protected String titulo;
    private int duracao;
    private int totalDeReproducoes = 0;
    private int curtidas = 0;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void curtir() {
        System.out.println("Curtiu " + this.titulo);
        this.curtidas++;
    }

    public void reproduzir() {
        System.out.println("Reproduzindo " + this.titulo);
        this.totalDeReproducoes++;
    }

    public void exibePosicao() {
        if (getClassificacao() < 3) {
            System.out.println(this.titulo + " está entre as 3 mais tocadas!!");
        } else if (getClassificacao() < 5) {
            System.out.println(this.titulo + " está entre as 5 mais tocadas!!");
        } else if (getClassificacao() < 10) {
            System.out.println(this.titulo + " está entre as 10 mais tocadas!!");
        }
    }

    public void exibeInformacoes() {
        String informacoes = """
                Informações sobre o áudio
                Título: %s
                Duração: %d minutos
                Vezes Reproduzidos: %d
                Quantidade de Curtidas: %d
                """.formatted(this.titulo, this.duracao, this.totalDeReproducoes, this.curtidas);
        System.out.print(informacoes);
    }

    public void exibeDuracaoTotalEscutada(CalculadoraDeTempo calculadora) {
        int duracaoTotal = calculadora.getDuracaoTotal();
        System.out.println("Duração total escutada: " + duracaoTotal + " minutos.");
    }

    @Override
    public int getClassificacao() {
        return (this.totalDeReproducoes + this.curtidas) / 2;
    }
}
