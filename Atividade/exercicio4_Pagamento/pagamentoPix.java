package Atividade.exercicio4_Pagamento;

public class PagamentoPix extends Pagamento {
    
    public PagamentoPix(double valor)
    {
        super(valor);
    }

    @Override
    public double calcularTaxa()
    {
        return 0.0;
    }

    @Override 
    public void processar()
    {
        System.out.println("Pagamento via Pix");
        System.out.println("Taxa de pagamento: R$ " + calcularTaxa());
        System.out.println("Total a pagar: R$ " + calcularTotal());
    }
}
