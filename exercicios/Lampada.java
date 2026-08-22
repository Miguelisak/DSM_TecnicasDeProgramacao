package exercicios;


public class Lampada
{
    private String cor;
    private boolean ligada;

    public Lampada(String cor, boolean ligadaInicial)
    {
        this.cor = cor;
        this.ligada = ligadaInicial;
    }

    //Metodo para ligar
    public void ligar()
    {
        ligada = true;
        System.out.println("A lampada " + cor + " foi ligada");
    }

    //Metodo para desligar
    public void desligar()
    {
        ligada = false;
        System.out.println("A lampada " + cor + " foi desligada");
    }

    //Metodo para mostrar estado atual
    public void MostrarEstado()
    {
        System.out.println("Cor da lampada: " + cor);

        //Operador Condicional para exibir de forma legivel
        String estadoTexto = ligada ? "Ligada" : "Desligada";
        System.out.println("Estado atual: " + estadoTexto);
        System.out.println("-------------------------------");
    }

    public static void main(String[] args) 
    {
        //Criando a lampada que começa desligada
        Lampada minhaLampada = new Lampada("Amarela", false);

        minhaLampada.MostrarEstado();

        //Ligando
        minhaLampada.ligar();
        minhaLampada.MostrarEstado();

        //Desligando
        minhaLampada.desligar();
        minhaLampada.MostrarEstado();
    }
}