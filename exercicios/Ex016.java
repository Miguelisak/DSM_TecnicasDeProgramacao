package Exercicios;
public class Ex016 {
    public static void main(String[] args) {
        // Criando Primeiro Objeto
        Produto p1 = new Produto();
        p1.nome = "Camiseta";
        p1.preco = 29.90;
        p1.quantidade = 50;

        // Criando Segundo Objeto
        Produto p2 = new Produto();
        p2.nome = "Calça jeans";
        p2.preco = 89.90;
        p2.quantidade = 20;

        // Mostrar Dados
        System.out.println("--- Dados do Produto 1 ---");
        p1.MostrarDados();

        System.out.println("--- Dados do Produto 2 ---");
        p2.MostrarDados();
    }
}

class Produto {
    String nome;
    double preco;
    int quantidade;

    double CalcularValorEstoque() {
        return preco * quantidade;
    }

    void MostrarDados() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor Total em estoque: R$ " + CalcularValorEstoque());
        System.out.println("----------------------------");
    }
}