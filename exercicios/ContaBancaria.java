package Exercicios;
public class ContaBancaria
{
    //Atributos
    private String Titular;
    private int numero;
    private double saldo;

    //Construtor
    public ContaBancaria (String titular, int numero, double saldoInicial) 
    {
        this.Titular = titular;
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    //Metodo para depositar um valor
    void depositar(double valor) 
    {
        if(valor > 0) 
        {
            saldo += valor;
            System.out.println("Deposito de R$" + valor + " realizado com sucesso");
        }
        else
        {
            System.out.println("Valor depositado tem que ser positivo");
        }
    }

    //Metodo para sacar um valor (permite saldo negativo)
    public void sacar(double valor)
    {
        if(valor > 0)
        {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso");
        }
        else
        {
            System.out.println("Valor depositado tem que ser positivo");
        }
    }

    //Metodo para mostrar o saldo atual
    public void MostrarSaldo ()
    {
        System.out.println("Titular: " + Titular);
        System.out.println("Numero da Conta: " + numero);
        System.out.println("Saldo Atual R$: " + saldo);
        System.out.println("-------------------------------");
    }

    public static void main(String[] args) {
        //Criando uma conta
        ContaBancaria minhaConta = new ContaBancaria("Maria Silva", 12345, 100.0);

        minhaConta.MostrarSaldo();

        //Depositando um valor
        minhaConta.depositar(50.0);
        minhaConta.MostrarSaldo();

        //Sacando um valor vai deixar o saldo negativo
        minhaConta.sacar(200.0);
        minhaConta.MostrarSaldo();
    }
}
