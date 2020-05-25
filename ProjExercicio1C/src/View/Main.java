package View;

import Model.ParImpar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Instancia o objeto de user input
        Scanner entrada = new Scanner(System.in);

        // Instancia o objeto da classe de Model
        ParImpar pI1 = new ParImpar();

        // Pede e lê cada dado - atributo
        System.out.print("Informe o número: ");
        pI1.setNumero(entrada.nextInt());

        // Invoca os métodos e mostra resultados
        System.out.println(pI1);
        if (pI1.testeParImpar()){
            System.out.println("Numero PAR!");
        }
        else {
            System.out.println("Número IMPAR!");
        }
    }
}
