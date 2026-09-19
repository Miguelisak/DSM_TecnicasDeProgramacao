package Atividade.exercicio1_encapsulamento;

public class Main {
    public static void main(String[] args) {
        Cofrinho viagem = new Cofrinho(500.00, "Viagem para Europa");

    viagem.mostrarResumo();
    viagem.depositar(200.00);
    viagem.retirar(150.00);
    viagem.retirar(1000.00);
    viagem.depositar(-1);
    viagem.mostrarResumo();

    }
}
