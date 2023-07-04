package com.github.lucasdevrj.harken.modelos;

public class Podcast extends Audio {
    private String descricao;
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
