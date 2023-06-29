package com.github.lucasdevrj.harken.modelos;

public class Musica extends Audio {

    private String genero;
    private String letras;
    private Album album;
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getLetras() {
        return letras;
    }
    public void setLetras(String letras) {
        this.letras = letras;
    }
    public void exibirLetras() {
        System.out.println(this.titulo + " letras:");
        System.out.println(this.letras);
    }
    @Override
    public void reproduzir() {
        super.reproduzir();
    }
}
