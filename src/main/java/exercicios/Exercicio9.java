package exercicios;

import java.util.Scanner;
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o salário atual do funcionário: R$ ");
        double salarioAtual = entrada.nextDouble();

        double percentualAumento = 0;

        if (salarioAtual <= 1200.00) {
            percentualAumento = 20;
        } else if (salarioAtual <= 1700.00) {
            percentualAumento = 15;
        } else if (salarioAtual <= 2500.00) {
            percentualAumento = 10;
        } else {
            percentualAumento = 5;
        }

        double aumento = (percentualAumento / 100) * salarioAtual;

        double novoSalario = salarioAtual + aumento;

        System.out.println("Salário antes do reajuste: R$ " + salarioAtual);
        System.out.println("Percentual de aumento aplicado: " + percentualAumento + "%");
        System.out.println("Valor do aumento: R$ " + aumento);
        System.out.println("Novo salário após o aumento: R$ " + novoSalario);
    }
}

