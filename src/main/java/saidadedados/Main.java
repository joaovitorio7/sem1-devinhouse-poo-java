package saidadedados;

public class Main {
    public static void main(String[] args) {
        System.out.println("Olá Mundo!");

        int MinhaIdade = 2;
        double peso = 7.2;

        boolean maiorIdade = true;

        //métodos para imprimir na tela %.2f  -  %f   - %n - %s  - %d   -  %b
        // printf tem o controle melhor para ficar mais legível para o usuário
        float altura = 1.75f;
        String nome = "João";
        System.out.printf("Meu nome é %s e minha altura é: %.2f.%n", nome, altura);

        long id = 1230000000000L;
        char primeiraLetraDoNome = 'J';


        int altura2 = (int) 1.75;
        //saída de dados

        System.out.println("Minha altura é: " + altura2 + "cm");

        // Tipos por referência
        // primitivo char
        String nomeCompleto = "João Vitório Ribeiro dos Santos";
        Double precoDoCigarro = 8.5;
        precoDoCigarro = null;
        //peso = null;
    }
}

