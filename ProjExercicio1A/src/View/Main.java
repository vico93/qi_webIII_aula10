package View;

import Model.NumeroInteiro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instancia o objeto de user input
        Scanner entrada = new Scanner(System.in);

        // Instancia o objeto da classe de Model
        NumeroInteiro nI1 = new NumeroInteiro();

        // Pede e lê cada dado - atributo
        System.out.print("Digite o número desejado: ");
        nI1.setNumero(entrada.nextInt());

        // Invoca os métodos e mostra resultados
        System.out.println(nI1);
        if (nI1.checarNumero()) {
            System.out.println("O número é maior que 100!");
        }
        else {
            System.out.println("O número é menor que 100!");
        }
    }
}
