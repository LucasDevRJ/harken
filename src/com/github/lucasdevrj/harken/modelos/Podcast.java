package com.github.lucasdevrj.harken.modelos;

import java.util.ArrayList;

public class Podcast extends Audio {
    private String descricao;
    private ArrayList<Episodio> listaEpisodios;
    private String host;
    private String convidado;

    public Podcast(String titulo, int duracao, String descricao, String host) {
        super(titulo, duracao);
        this.descricao = descricao;
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

    public void setHost(String host) {
        this.host = host;
    }

    public String getConvidado() {
        return convidado;
    }

    public void setConvidado(String convidado) {
        this.convidado = convidado;
    }

    public void adicionaEpisodio(Episodio episodio) {
        this.listaEpisodios.add(episodio);
        System.out.println("O episodio " + episodio.getTitulo() + " foi adicionado com sucesso!");
    }

    @Override
    public void exibeInformacoes() {
        super.exibeInformacoes();
        String informacoes = """
                Descrição: %s
                Host: %s
                Convidado: %s
                """.formatted(this.descricao, this.host, this.convidado);
        System.out.print(informacoes);
    }
}
