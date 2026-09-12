package Atividade.exercicio3_polimorfismo;

public class main {
    public static void main(String[] args) {
        Calculadora calcular = new Calculadora();

        int a = calcular.somar(10, 20);
        double b = calcular.somar(2.5, 3.8);
        int c = calcular.somar(1, 2, 3);

        System.out.println("Metodo 1: " + a + " \nMetodo 2: " + b + " \nMetodo 3: " + c);

        
    }
}
