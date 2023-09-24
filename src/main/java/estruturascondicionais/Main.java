package estruturascondicionais;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {

        Scanner entrada =  new Scanner(System.in);

        System.out.println("Qual sua idade?");
        int idadeUsuario = parseInt(entrada.nextLine());

        if (idadeUsuario <= 0) {
            System.out.println("Idade é obrigatório. Insira algum valor:");
            idadeUsuario = parseInt(entrada.nextLine());
        } else if (idadeUsuario >= 18) {
            System.out.println("Você já pode tirar a carteira de motorista.");
        } else {
            System.out.println("Você não pode tirar a carteira de motorista.");
        }
        System.out.printf("Sua idade é %d%n", idadeUsuario);

        System.out.println("Qual nome da sua mãe?");
        String nomeDaMae = entrada.nextLine();

        if (nomeDaMae != null && !nomeDaMae.isBlank()) {
            System.out.println(nomeDaMae);
        } else {
            System.out.println("Nome da mãe é obrigatório. Insira algum valor:");
            nomeDaMae = entrada.nextLine();
            System.out.println(nomeDaMae);
        }
    }
}
