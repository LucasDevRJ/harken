package com.github.lucasdevrj.harken.modelos;

import com.github.lucasdevrj.harken.calculadora.Calcula;
import com.github.lucasdevrj.harken.calculadora.Calculadora;
import com.github.lucasdevrj.harken.classificacao.Classificavel;

import java.util.ArrayList;
import java.util.zip.Adler32;

public class Audio implements Classificavel, Calcula {
    protected String titulo;
    protected int duracao;
    protected int totalDeReproducoes = 0;
    private int curtidas = 0;

    private ArrayList<Audio> listaAudios = new ArrayList<Audio>();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracaoCalculada() {
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

    public ArrayList<Audio> getListaAudios() {
        return listaAudios;
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

    public void exibeTodosAudios() {
        System.out.println("Lista de audios cadastrados:");
        for (int i = 0; i < this.listaAudios.size(); i++) {
            System.out.println(this.listaAudios.get(i).getTitulo());
        }
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
    public int getTotalReproducoesAudio() {
        return this.totalDeReproducoes;
    }
}
