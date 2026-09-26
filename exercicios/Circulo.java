package Exercicios;

public class Circulo 
{
    //Atributos
    private double raio;

    //Construtor
    public Circulo (double raioInicial)
    {
        this.raio = raioInicial;
    }

    //metodo para calcular a area
    public double CalcularArea ()
    {
        return Math.PI * (raio * raio);
    }

    //metodo para calcular a circuferencia
    public double CalcularCircuferencia ()
    {
        return 2 * Math.PI * raio;
    }

    public void MostrarDados()
    {
        //Criando um metodo para mostrar os dados e os resultados
        System.out.println("Raio: " + raio);
        System.out.printf("Circuferencia: %.2f\n", CalcularCircuferencia());
        System.out.printf("Area: %.2f\n", CalcularArea());
        System.out.println("------------------------------------------");
    }

    public static void main(String[] args) {
        //Criando um Circulo
        Circulo meuCirculo = new Circulo(5.0);
        meuCirculo.MostrarDados();

        //Criando outro circulo
        Circulo outroCirculo = new Circulo(10.0);
        outroCirculo.MostrarDados();
    }
}