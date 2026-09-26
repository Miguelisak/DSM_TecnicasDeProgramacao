package Exercicios;
import java.util.Scanner;

public class Ex011 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = ler.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = ler.nextInt();
        ler.nextLine();

        System.out.println("Digite qual e o seu curso: ");
        String curso = ler.nextLine();

        System.out.println("----FICHA----");
        System.out.printf("Nome: %s \n Idade: %d \n Curso: %s \n", nome, idade, curso);

    }
}
