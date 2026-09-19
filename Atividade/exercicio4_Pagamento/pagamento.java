package Atividade.exercicio4_Pagamento;

public class Pagamento {
    private double valor;

    public Pagamento (double valor)
    {
        if(valor >= 0)
        {
            this.valor = valor;
        }
    }

    public double getValor()
    {
        return this.valor;
    }

    public double calcularTaxa()
    {
        return 0.0;
    }

    public double calcularTotal()
    {
        return this.valor + calcularTaxa();
    }

    public void processar()
    {
        System.out.println("Total do pagamento: R$ " + String.format("%.2f", calcularTotal()));
    }
}
