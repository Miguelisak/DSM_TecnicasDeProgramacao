package Exercicios;
import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        System.out.println("---Media---");
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite sua nota do primeiro bimestre:");
        float nota1 = ler.nextFloat();
        System.out.println("Digite a nota do segundo bimestre:");
        float nota2 = ler.nextFloat();
        double soma1 = nota1 + nota2;
        double media = soma1 / 2;
        System.out.printf("Sua media foi: %.2f \n",media);
        System.out.println("-------------------------------------------------");
    }
}
