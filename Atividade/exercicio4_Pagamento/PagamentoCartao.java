package Atividade.exercicio4_Pagamento;

public class PagamentoCartao extends Pagamento{
    private int parcelas;
    
    public PagamentoCartao(double valor, int parcelas)
    {
        super(valor);
        this.parcelas = parcelas;

    }

    public int getParcelas() {
        return parcelas;
    }

    @Override
    public double calcularTaxa() {
        return getValor() * 0.03;
    }

    @Override
    public void processar() {
        System.out.println("Pagamento via Cartão");
        System.out.println("Parcelas: " + getParcelas());
        System.out.println("Taxa de pagamento: R$ " + calcularTaxa());
        System.out.println("Total a pagar: R$ " + calcularTotal());
    }
}
