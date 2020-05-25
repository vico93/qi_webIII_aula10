package View;

import Model.Aluno;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instancia o objeto de user input
        Scanner entrada = new Scanner(System.in);

        // Instancia o objeto da classe de Model
        Aluno vico = new Aluno();

        // Pede e lê cada dado - atributo
        System.out.print("Digite a nota 1: ");
        vico.setNota1(entrada.nextDouble());

        System.out.print("Digite a nota 2: ");
        vico.setNota2(entrada.nextDouble());

        System.out.print("Digite a nota 3: ");
        vico.setNota3(entrada.nextDouble());

        // Invoca os métodos e mostra resultados
        System.out.println(vico);
        System.out.println("A média alcançada foi: " + String.format("%.2f", vico.calcularMedia()));
        if (vico.calcularMedia() > 6.0){
            System.out.println("O aluno foi APROVADO!");
        }
        else {
            System.out.println("O aluno foi REPROVADO!");
        }
    }
}
