package entradadedados;

//java utilitários scanner
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Declarou uma variável do tipo  Scanner e instanciou um novo Scanner
        // e atribuiu o objeto Scanner na variável de entrada;

        //o Scanner precisa saber de onde vai vir o conteúde, os estados de entrada (System in)

        //Cada vez que o usuário digitar uma linha de entrada vai ser guardada essa lina na variável nome;
//        Scanner entrada = new Scanner(System.in);
//        String nome = entrada.nextLine();

        //new está envolvendo o construtor da classe. ele está construindo o objeto do tipo Scanner.
        Scanner entrada = new Scanner(System.in);
        System.out.println("Essa operação vai ocupar 100Bytes de espaço em disco. prosseguir? Y/n");
        String decisaoUsuario = entrada.nextLine();
        System.out.println("Decisão do usuário: " + decisaoUsuario);


        System.out.println("Qual seu nome?");
        String nomeUsuario = entrada.nextLine();

        System.out.println("Qual sua idade?");
        int idade = entrada.nextInt();

        System.out.println("Qual sua altura?");
        double altura = entrada.nextDouble();

        //Se colocar 1.75 na entrada vai dar um erro, pois está com linguagem do brasil;
        System.out.printf("O usuário %s tem %d anos e mede %.2fm.", nomeUsuario, idade, altura);

    }
}
