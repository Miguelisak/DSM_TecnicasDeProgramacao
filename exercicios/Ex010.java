package exercicios;
import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a distancia percorrida em km: ");
        int distancia = ler.nextInt();

        System.out.println("Digite o quanto de combustivel foi gasto em litros: ");
        int combustivel = ler.nextInt();

        int ConsumoMedio = distancia / combustivel;

        System.out.printf("Voce percorreu: %d km/l \n",ConsumoMedio);
    }
}
