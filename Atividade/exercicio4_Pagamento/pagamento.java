package Atividade.exercicio4_Pagamento;

public class pagamento {
    private double valor;

    public pagamento (double valor)
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

    public double Calculartaxa()
    {
        return 0.0;
    }

    public double CalcularTotal()
    {
        return this.valor + Calculartaxa();
    }

    public void processar()
    {
        System.out.println("Total do pagamento: R$ " + String.format("%.2f", CalcularTotal()));
    }
}
