package ExDeCarros;

public class Carro {
    String marca;
    String cor;
    String modelo;
    int velocidade;
    int ano;
    String combustivel;
    Boolean ligado;

    void acelerar ()
    {
        if(ligado == true)
        {
            System.out.println("Acelerando...");
            velocidade = velocidade + 10;
        }
        else
            System.out.println("Carro não esta ligado não pode acelerar");
    }

    void frear ()
    {
        velocidade = velocidade - 10;
    }

    void ligar ()
    {
        System.out.println("ligando o carro...");
        System.out.println();
        ligado = true;
        if(ligado == true)
            System.out.println("Carro Ligado.");
    }

    void desligar ()
    {
        ligado = false;
        if(ligado == false)
            System.out.println("Carro Desligando.");
        System.out.println();
        System.out.println("Carro Desligado");
    }

    void buzinar () 
    {
        System.out.println("Biip!!");
    }

    void MostrarDados ()
    {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Velocidade: " + velocidade);
        System.out.println("Combustivel: " + combustivel);
    }
}

