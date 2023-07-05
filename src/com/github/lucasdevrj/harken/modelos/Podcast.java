package com.github.lucasdevrj.harken.modelos;

import java.util.ArrayList;

public class Podcast extends Audio {
    private String descricao;
    private String host;
    private ArrayList<Episodio> listaEpisodios = new ArrayList<Episodio>();
    private int quantidadeEpisodios = 0;

    public Podcast(String titulo, int duracao, String host) {
        super(titulo, duracao);
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getHost() {
        return host;
    }

    public int getQuantidadeEpisodios() {
        return quantidadeEpisodios;
    }

    public ArrayList<Episodio> getListaEpisodios() {
        return listaEpisodios;
    }

    public void adicionaEpisodio(Episodio episodio) {
        this.listaEpisodios.add(episodio);
        this.quantidadeEpisodios++;
        this.duracao += episodio.getDuracao();
        System.out.println("O episodio " + episodio.getTitulo() + " foi adicionado com sucesso!");
    }

    @Override
    public void exibeInformacoes() {
        super.exibeInformacoes();
        String informacoes = """
                Descrição: %s
                Host: %s
                Quantidade de episodios: %d
                """.formatted(this.descricao, this.host, this.quantidadeEpisodios);
        System.out.print(informacoes);
    }
}
