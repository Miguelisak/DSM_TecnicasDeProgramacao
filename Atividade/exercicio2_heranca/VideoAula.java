package Atividade.exercicio2_heranca;

public class VideoAula extends Conteudo
{
    public String plataforma;

    public VideoAula(String titulo, int duracaoMinutos, String plataforma)
    {
        super(titulo, duracaoMinutos);
        this.plataforma = plataforma;
    }

    public void reproduzirVideo()
    {
        System.out.println("Reproduzindo a videoaula \"" + this.titulo + "\" na plataforma " + this.plataforma + "...");
    }
}
