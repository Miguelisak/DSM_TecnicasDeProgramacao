package Atividade.exercicio2_heranca;

public class main {
    public static void main(String[] args) {
        VideoAula matematica = new VideoAula("Matematica Basica", 50, "Youtube");

        matematica.exibirResumo();
        matematica.reproduzirVideo();

        System.out.println();

        Podcast Flow = new Podcast("FlowPodcast", "Encontro com um matematico", 120);

        Flow.exibirResumo();
        Flow.ouvirPodcast();
    }
}
