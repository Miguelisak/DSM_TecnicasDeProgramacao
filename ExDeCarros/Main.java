package ExDeCarros;

public class Main
{
    public static void main(String[] args) 
    {
        Carro carro1 = new Carro();
        carro1.marca = "Fiat";
        carro1.modelo = "Uno";
        carro1.ano = 2020;
        carro1.cor = "Vermelho";
        carro1.velocidade = 0;
        carro1.combustivel = "flex";
        carro1.ligado = false;

        carro1.ligar();
        System.out.println();
        carro1.acelerar();

        carro1.buzinar();

        System.out.println();
        carro1.desligar();
    }
}
