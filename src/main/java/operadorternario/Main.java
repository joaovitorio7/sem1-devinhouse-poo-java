package operadorternario;

public class Main {
    public static void main(String[] args) {
        int idade = 18;

        String maioridade = idade >= 18 ? "você é maior de idade" : "você é menor de idade";

        System.out.println(maioridade);

        int num = 4;

        boolean ehPar = num % 2 == 0; // ? true : false;

        String parOuImpar = num % 2 == 0 ? "par" : "ímpar";

        System.out.printf("O número %d é %s", num, parOuImpar);
    }
}
