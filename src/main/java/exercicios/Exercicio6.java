package exercicios;

import java.util.Scanner;
import java.util.Calendar;

public class Exercicio6 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);


        System.out.print("Informe sua data de nascimento (formato DD/MM/AAAA): ");
        String dataNascimento = scanner.nextLine();


        String[] partesData = dataNascimento.split("/");
        int dia = Integer.parseInt(partesData[0]);
        int mes = Integer.parseInt(partesData[1]);
        int ano = Integer.parseInt(partesData[2]);


        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);


        int idade = anoAtual - ano;


        String situacaoVoto;
        if (idade < 16) {
            situacaoVoto = "Voto proibido";
        } else if (idade >= 16 && idade <= 17 || idade >= 60) {
            situacaoVoto = "Voto opcional";
        } else {
            situacaoVoto = "Voto obrigatório";
        }

        // Exibe a situação de voto
        System.out.println("Sua idade é: " + idade + " anos");
        System.out.println("Situação de voto: " + situacaoVoto);
    }
}
