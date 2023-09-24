package switchcase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner entrada =  new Scanner(System.in);

        System.out.println("Qual sua data de nascimento? formato dd/MM/yyyy");
        String dataNascimento = entrada.nextLine();

        String mesNascimento = dataNascimento.substring(3,5);
        String result = "";
        switch (mesNascimento) {
            case "01":
                result = "Janeiro";
                break;
            case "02":
                result = "Fevereiro";
                break;
            case "03":
                result = "Março";
                break;
            case "04":
                result = "Abril";
                break;
            case "05":
                result = "Maio";
                break;
            case "06":
                result = "Junho";
                break;
            case "07":
            case "08":
            case "09":
            case "10":
            case "11":
            case "12":
                result = "Segundo semestre";
                break;
            default:
                result = "Mês inválido.";
        }

        switch (mesNascimento) {
            case "01":
                result = "Janeiro";
                break;
            case "02":
                result = "Fevereiro";
                break;
            case "03":
                result = "Março";
                break;
            case "04":
                result = "Abril";
                break;
            case "05":
                result = "Maio";
                break;
            case "06":
                result = "Junho";
                break;
            case "07", "08", "09", "10", "11", "12":
                result = "Segundo semestre";
                break;
            default:
                result = "Mês inválido.";
        }

        result =
                switch (mesNascimento) {
                    case "01" -> "Janeiro";
                    case "02" -> "Fevereiro";
                    case "03" -> "Março";
                    case "04" -> "Abril";
                    case "05" -> "Maio";
                    case "06" -> "Junho";
                    case "07", "08", "09", "10", "11", "12" -> "Segundo semestre";
                    default -> "Mês inválido.";
                };

        System.out.println(result);
    }
}