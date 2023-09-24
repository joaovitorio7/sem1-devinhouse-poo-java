package exercicios;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        int aleatorio = (int) Math.round(Math.random() * (10 - 5) + 5);

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira um número de 5 a 10: ");
        int palpite = Integer.parseInt(entrada.nextLine());

        while (palpite != aleatorio) {
            System.out.println("Vocẽ errou! Tente Novamente: ");
            palpite = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("Parabéns, você acertou!");
    }
}
