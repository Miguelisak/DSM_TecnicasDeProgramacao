package exercicios;
public class ContaBancariaEx26 {
    static class ContaBancaria {
        //Atributos
        private String titular;
        private double saldo;

        //Construtor
        public ContaBancaria(String titular, double saldo) {
            this.titular = titular;
            this.saldo = saldo;
        }

        //Métodos para depositar, sacar e exibir saldo
        public void depositar(double valor) {
            if (valor > 0) {
                saldo += valor;
                System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
            } else {
                System.out.println("Valor de depósito inválido.");
            }
        }

        public void sacar(double valor) {
            if (valor > 0 && valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            } else {
                System.out.println("Saldo insuficiente ou valor de saque inválido.");
            }
        }

        public void exibirSaldo() {
            System.out.println("Titular: " + titular + " | Saldo: R$" + saldo);
        }
    }

    public static void main(String[] args) {
        // Criando duas contas bancárias
        ContaBancaria Conta1 = new ContaBancaria("João", 1000.0);
        ContaBancaria Conta2 = new ContaBancaria("Miguel", 500.0);

        System.out.println("--- Saldo Inicial ---");
        Conta1.exibirSaldo();
        Conta2.exibirSaldo();

        System.out.println("\n--- Operações ---");
        // Operações exclusivamente na conta 1
        Conta1.depositar(200.0);
        Conta1.sacar(100.0);

        // Operações exclusivamente na conta 2
        Conta2.depositar(150.0);
        Conta2.sacar(300.0);
        
        System.out.println("\n--- Saldo Final ---");
        // Exibição provando que as alterações em um objeto não afetaram o outro
        Conta1.exibirSaldo();
        Conta2.exibirSaldo();
    }
    
}
