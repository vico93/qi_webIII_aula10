package View;

import Model.DiaSemana;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instancia o objeto de user input
        Scanner entrada = new Scanner(System.in);

        // Instancia o objeto da classe de Model
        DiaSemana dS1 = new DiaSemana();

        // Pede e lê cada dado - atributo
        System.out.println("Digite o número da semana (1-DOM - 7-SÁB): ");
        dS1.setNumero(entrada.nextInt());

        // Invoca os métodos e mostra resultados
        System.out.println(dS1);
        System.out.println(dS1.acharDiaDaSemana());
    }
}
