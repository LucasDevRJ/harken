package com.github.lucasdevrj.harken.modelos;

public class Musica extends Audio {

    private String genero;
    private String letras;

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

    @Override
    public void reproduzir() {
        System.out.printf("Reproduzindo a música %s", this.titulo);
    }
}
