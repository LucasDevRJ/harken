package com.github.lucasdevrj.harken.modelos;

import com.github.lucasdevrj.harken.calculadora.Calcula;
import com.github.lucasdevrj.harken.calculadora.Calculadora;
import com.github.lucasdevrj.harken.classificacao.Classificavel;

public class Audio implements Classificavel, Calcula {
    protected String titulo;
    protected int duracao;
    protected int totalDeReproducoes = 0;
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

    public void exibeDuracaoTotalEscutada(Calculadora duracao) {
        int duracaoTotal = duracao.getDuracaoTotal();
        System.out.println("Duração total escutada: " + duracaoTotal + " minutos.");
    }

    @Override
    public int getClassificacao() {
        return (this.totalDeReproducoes + this.curtidas) / 2;
    }

    @Override
    public String getNome() {
        return this.titulo;
    }

    @Override
    public int getDuracaoAudio() {
        return this.duracao;
    }
}
