package exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int numInteiro = Integer.parseInt(entrada.nextLine());

        if (numInteiro % 2 == 0) {
            System.out.printf("O número %d, é par!", numInteiro);
        } else {
            System.out.printf("O número: %d, é ímpar!", numInteiro);
        }
    }
}
