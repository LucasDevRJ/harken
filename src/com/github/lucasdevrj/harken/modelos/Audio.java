package com.github.lucasdevrj.harken.modelos;

public class Audio {
    protected String titulo;
    private int duracao;
    private int totalDeReproducoes = 0;
    private int curtidas = 0;
    //private Classificavel classificacao;

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
        this.curtidas++;
    }

    public void reproduzir() {
        System.out.println("Reproduzindo");
        this.totalDeReproducoes++;
    }
}
