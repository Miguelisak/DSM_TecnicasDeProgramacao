package exercicios;
import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        System.out.println("---Fahrenheit---");
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius: ");
        double Celsius = ler.nextDouble();
        double f = Celsius * 9 / 5 + 32;
        System.out.printf("%.2f Celsius e igual a %.2f Fahrenheits\n",Celsius,f);
        System.out.println("----------------------------------------------------------------");
    }
}
