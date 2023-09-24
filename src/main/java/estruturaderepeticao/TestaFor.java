package estruturaderepeticao;

import java.util.Scanner;

public class TestaFor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira Seu nome: ");
        String nome = entrada.nextLine();

        //o for serve para saber a qtd de vezes que queremos iterar;
        for (int i = 0; i< nome.length(); i++){
            System.out.println(nome.charAt(i));
        }
    }
}
