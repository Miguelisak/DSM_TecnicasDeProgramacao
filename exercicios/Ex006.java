package exercicios;
import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
        System.out.println("---Area do retangulo---");
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a base do retangulo: ");
        double base = ler.nextFloat();
        System.out.println("Digite a altura do retangulo: ");
        double altura = ler.nextFloat();
        double area = base * altura;
        System.out.printf("A area do retangulo e area = base * altura = %.3f\n",area);
        System.out.println("------------------------------------------------------------------");
    }
}
