package exercicios;

import java.util.Scanner;

public class Ex012 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String NomeCompleto = ler.nextLine();

        System.out.printf("Nome: %s \n", NomeCompleto);
        System.out.printf("Nome Maiusculo: %s \n", NomeCompleto.toUpperCase());
        System.out.printf("Seu nome tem: %d caracteres",NomeCompleto.length());
    }
}
