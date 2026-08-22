package exercicios;
import java.util.Scanner;

public class Ex014 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o primeiro valor:");
        double num1 = ler.nextDouble();
        System.out.println("Digite o segundo valor:");
        double num2 = ler.nextDouble();

        double soma = num1 + num2;
        double sub = num1 - num2;
        double mult = num1 * num2;
        double divisao = num1 / num2;
        
        System.out.println(" Resultados ");
        System.out.printf("Soma: %.2f \n", soma);
        System.out.printf("Subtracao: %.2f \n", sub);
        System.out.printf("Multiplicacao: %.2f \n", mult);
        System.out.printf("Divisao: %.2f \n", divisao);

    }
}
