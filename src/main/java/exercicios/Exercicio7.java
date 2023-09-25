package exercicios;

import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Calculadora Simples");
        System.out.print("Digite o primeiro número: ");
        double numero1 = entrada.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = entrada.nextDouble();

        System.out.print("Digite a operação (somar, subtrair, multiplicar, dividir): ");
        String operacao = entrada.next();

        double resultado = 0.0;

        switch (operacao) {
            case "somar":
                resultado = numero1 + numero2;
                break;
            case "subtrair":
                resultado = numero1 - numero2;
                break;
            case "multiplicar":
                resultado = numero1 * numero2;
                break;
            case "dividir":
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Erro: Divisão por zero!");
                    System.exit(1);
                }
                break;
            default:
                System.out.println("Operação inválida!");
                System.exit(1);
        }
        System.out.printf("Resultado: %.2f", resultado);
    }
}
