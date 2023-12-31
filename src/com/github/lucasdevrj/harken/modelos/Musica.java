package com.github.lucasdevrj.harken.modelos;

public class Musica extends Audio {
    private Genero genero;
    private String letras;
    private Album album;

    public Musica(String titulo, int duracao, Genero genero, Album album) {
        super(titulo, duracao);
        this.genero = genero;
        this.album = album;
    }

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
                Banda: %s
                """.formatted(this.genero.getTitulo(),
                this.album.getTitulo(), this.album.getBanda().getTitulo());
        System.out.println(informacoes);
    }

    @Override
    public int compareTo(Audio o) {
        return super.compareTo(o);
    }
}
