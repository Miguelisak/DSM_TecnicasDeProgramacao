package Atividade.exercicio4_Pagamento;

public class Main {
    public static void main(String[] args) {
        Pagamento pagamento1 = new PagamentoPix(100.0);
        pagamento1.processar();

        System.out.println();

        Pagamento pagamento2 = new PagamentoCartao(200.0, 3);
        pagamento2.processar();
    }
}
