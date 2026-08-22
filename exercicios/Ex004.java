package exercicios;
import java.util.Scanner;
public class Ex004 {
    public static void main(String [] args) {
        System.out.println("--------Exercicio03--------");
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor de A:");
        float A = ler.nextFloat();
        System.out.println("Digite o valor de B:");
        float B = ler.nextFloat();
        float soma = A + B;
        float sub = A - B;
        float mult = A * B;
        float divisao = A / B;
        float resto = A % B;
        System.out.printf("A soma de: %.2f + %.2f = %.2f\n",A,B,soma);
        System.out.printf("A subtracao de: %.2f - %.2f = %.2f\n",A,B,sub);
        System.out.printf("A multiplicacao de: %.2f * %.2f = %.2f\n",A,B,mult);
        System.out.printf("A divisao de: %.2f / %.2f = %.2f\n",A,B,divisao);
        System.out.printf("O resto da divisao de: %.2f %% %.2f = %.2f\n",A,B,resto);
        System.out.println("------------------------------------------------------------------");
    }
}
