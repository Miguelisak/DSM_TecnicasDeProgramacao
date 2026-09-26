package Exercicios;
import java.util.Scanner;

public class Ex013 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu Nome: ");
        String Nome = ler.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String Sobrenome = ler.nextLine();

        System.out.printf("Inicial do primeiro nome: %s \nInicial do Sobrenome: %s \n",Nome.charAt(0), Sobrenome.charAt(0));
    }
}
