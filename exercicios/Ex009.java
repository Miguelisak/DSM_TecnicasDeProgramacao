package Exercicios;
import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) {
        System.out.println("Dados o preço de um produto e o valor pago, calcule o troco.");
        double preco = 47.49;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor do pagamento: ");
        double pagamento = ler.nextDouble();
        double troco = pagamento - preco;

        System.out.printf("O preço do produto é $%.2f você pago $%.2f seu troco sera: $%.2f \n",preco, pagamento, troco);
    }
}
