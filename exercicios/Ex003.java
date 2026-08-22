package exercicios;
public class Ex003 {
    public static void main(String []args) {
        System.out.println("Exercicio003");
        System.out.println("A diferença de print pra println e que println quebra a linha e print nao quebra");

        int idade = 20, A = 10, B = 20, C = 0;
        String nome = "Marina";
        double altura = 1.80;

        System.out.printf("%s Possui %d anos tem %.3f de altura\n",nome,idade, altura);
        C = A;
        A = B;
        B = C;
        System.out.printf("A %d, B %d, C %d\n",A,B,C);
        altura = 1.75;
        char letra = 'A';
        boolean matriculado = true;
        System.out.println("------------------------------------------------------------");
    }
}
