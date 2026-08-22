package exercicios;
import java.util.Scanner;

public class Ex015 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite uma palavra:");
        String nome = ler.nextLine();

        System.out.printf("Primeiro Caractere da palavra: %s \n",nome.charAt(0));

        System.out.printf("Ultimo Caractere da palavra: %s \n",nome.charAt(nome.length() - 1));
    }
}
