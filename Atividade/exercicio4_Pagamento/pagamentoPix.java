package Atividade.exercicio4_Pagamento;

public class pagamentoPix extends pagamento {
    
    public pagamentoPix(double valor)
    {
        super(valor);
    }

    @Override
    public double CalcularTaxa()
    {
        return 0.0;
    }

    @Override 
    public void processar()
    {
        
    }



}
