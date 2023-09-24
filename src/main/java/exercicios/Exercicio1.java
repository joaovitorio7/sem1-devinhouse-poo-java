package exercicios;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual seu sobrenome?");
        String sobrenome = entrada.nextLine();

        System.out.println("Qual seu nome?");
        String nome = entrada.nextLine();

        entrada.close();

        String nomeCompleto = nome + " " + sobrenome;
        int numeroLetras = nomeCompleto.length();

        System.out.printf("Seu nome completo é: %s%n", nomeCompleto);
        System.out.printf("Seu nome completo possui: %d letras.", numeroLetras);
    }
}
