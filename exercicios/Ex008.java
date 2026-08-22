package exercicios;
public class Ex008 {
    public static void main(String[] args) {
        System.out.println("---Conversao de tempo---");
        int TotalSegundos = 5200;
        int Minutos = (TotalSegundos % 3600) / 60;
        int Horas = TotalSegundos / 3600;
        int SegundosRestantes = TotalSegundos % 60;

        System.out.printf("Horas: %d, Minutos: %d, Segundos: %d \n",Horas, Minutos, SegundosRestantes);
    }
}
