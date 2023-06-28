package com.github.lucasdevrj.harken.modelos;

public class Podcast extends Audio {
    private String descricao;
    private int totalDeEpisodios = 0;

    private Episodio episodio;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getTotalDeEpisodios() {
        return totalDeEpisodios;
    }

    public void adiciona(Episodio episodio) {
        System.out.println("O episodio de Podcast " + this.episodio.getNome() + " foi adicionado!");
        this.totalDeEpisodios++;
    }
}
