package Atividade.exercicio2_heranca;

public class Podcast extends Conteudo {
    public String apresentador;

    public Podcast(String apresentador, String titulo , int duracaoMinutos)
    {
        super(titulo, duracaoMinutos);
        this.apresentador = apresentador;
    }

    public void ouvirPodcast()
    {
        System.out.println("Reproduzindo o podcast \"" + this.titulo + "\" apresentado por " + this.apresentador + "...");
    }
}
