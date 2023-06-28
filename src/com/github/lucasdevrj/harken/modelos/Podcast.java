package com.github.lucasdevrj.harken.modelos;

public class Podcast extends Audio {
    private String descricao;
    private int totalDeEpisodios;
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

    public void setTotalDeEpisodios(int totalDeEpisodios) {
        this.totalDeEpisodios = totalDeEpisodios;
    }

    public Episodio getEpisodio() {
        return episodio;
    }

    public void setEpisodio(Episodio episodio) {
        this.episodio = episodio;
    }
}
