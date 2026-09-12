package Atividade.exercicio1_encapsulamento;

public class Cofrinho 
{
    private String objetivo;
    private double saldo;

    public Cofrinho (double saldo, String objetivo)
    {
        if (saldo >= 0)
        {
            this.saldo = saldo;
        }
        else
        {
            this.saldo = 0.0;
        }
        this.objetivo = objetivo;
    }

    public String getObjetivo()
    {
        return this.objetivo;
    }

    public double getSaldo()
    {
        return this.saldo;
    }

    public void depositar(double valor)
    {
        if(valor > 0)
        {
            this.saldo += valor;
            System.out.println("Depósito de R$: " + valor + " realizado com sucesso.");

        }
        else
        {
            System.out.println("Valor de depósito inválido! O valor deve ser maior que zero.");
        }
    }

    public void retirar(double valor)
    {
        if (this.saldo > 0 && valor <= this.saldo)
        {
            this.saldo -= valor;
            System.out.println("Retirada de R$: " + valor + " realizado com sucesso.");
        }
        else if (valor > this.saldo)
        {
            System.out.println("Saldo insuficiente para realizar esta retirada.");
        }
        else
        {
            System.out.println("Valor de depósito inválido! O valor deve ser maior que zero.");
        }
    }

    public void mostrarResumo()
    {
        System.out.println("\n=== Resumo do Cofrinho ===");
        System.out.println("Objetivo: " + this.objetivo);
        System.out.println("Saldo atual: R$ " + String.format("%.2f", this.saldo));
        System.out.println("=====================================\n");
    }
}