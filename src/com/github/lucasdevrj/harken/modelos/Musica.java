package com.github.lucasdevrj.harken.modelos;

public class Musica extends Audio {

    private Genero genero;
    private String letras;
    private Album album;

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
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

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
    @Override
    public void exibeInformacoes() {
        super.exibeInformacoes();
        String informacoes = """
                Genêro: %s
                Album: %s
                """.formatted(this.genero, this.album.getNome());
        System.out.println(informacoes);
    }
}
