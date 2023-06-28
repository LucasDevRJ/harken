public class Audio {
    private String titulo;
    private int duracao;
    private int totalDeReproducoes;
    private int curtidas;
    //private Classificavel classificacao;

    public void curtir() {
        this.curtidas++;
    }

    public void reproduzir() {
        System.out.println("Reproduzindo");
    }
}
