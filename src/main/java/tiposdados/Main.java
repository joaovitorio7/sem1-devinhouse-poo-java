package tiposdados;

// Tipos Primitivos

public class Main {
    public static void main(String[] args) {
        System.out.println("Olá Mundo!");

        int MinhaIdade = 2;
        double peso = 7.2;

        boolean maiorIdade = true;

        float altura = 0.5f;

        long id = 1230000000000L;
        char primeiraLetraDoNome = 'J';

        //resolvendo problemas de entrada de informação
        // conversão: typecast

        int altura2 = (int) 1.75;
        System.out.println(altura2);

        // Tipos por referência
        // primitivo char
        String nomeCompleto = "João Vitório Ribeiro dos Santos";
        Double precoDoCigarro = 8.5;
        precoDoCigarro = null;
        //peso = null;
    }
}
