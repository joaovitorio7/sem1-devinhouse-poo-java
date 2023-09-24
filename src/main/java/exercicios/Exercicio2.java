package exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual sua altura?");
        double altura = Double.parseDouble(entrada.nextLine());

        System.out.println("Digite qual seu peso: ");
        double peso = Double.parseDouble(entrada.nextLine());

        double imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + imc);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso.");
        } else if (imc < 25) {
            System.out.println("Peso saudável.");
        } else if (imc < 30) {
            System.out.println("Sobrepeso.");
        } else if (imc < 35) {
            System.out.println("Obesidade grau I.");
        } else if (imc < 40) {
            System.out.println("Obesidade grau II.");
        } else {
            System.out.println("Obesidade grau III (mórbida).");
        }
    }
}
