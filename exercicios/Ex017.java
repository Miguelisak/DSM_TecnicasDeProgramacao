package Exercicios;
public class Ex017 {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.nome = "Miguel";
        a1.Nota1 =  7.5;
        a1.Nota2 = 8;

        Aluno a2 = new Aluno();
        a2.nome = "Caike";
        a2.Nota1 = 9.5;
        a2.Nota2 = 10;

        a1.MostrarDados();
        a2.MostrarDados();
    }
}

class Aluno {
    String nome;
    double Nota1, Nota2;
    
    double CalcularMedia() {
        return (Nota1 + Nota2) / 2;

    }

    void MostrarDados() {
        System.out.println("Aluno: " + nome);
        System.out.println("Primeira Nota: " + Nota1);
        System.out.println("Segunda Nota: " + Nota2);
        System.out.println("Media Final: " + CalcularMedia());
        System.out.println("------------------------------");
    }
}
