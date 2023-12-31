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

        // conversão para nextline:
        System.out.println("Qual sua idade?");
        int idade = Integer.parseInt(entrada.nextLine());

        //pode ocorrer erro
//        System.out.println("Qual sua altura?");
//        double altura = entrada.nextDouble();
//        double teste2 = entrada.nextDouble();

        //preferência
        System.out.println("Qual sua altura?");
        double altura = Double.parseDouble(entrada.nextLine());


        //Se colocar 1.75 na entrada vai dar um erro, pois está com linguagem do brasil;
        System.out.printf("O usuário %s tem %d anos e mede %.2fm.%n", nomeUsuario, idade, altura);

        // MANIPULANDO DADOS com MÉTODOS disponíveis para fazer operações com string.
        System.out.printf("O nome %s tem %d caracteres.%n", nomeUsuario, nomeUsuario.length());
        System.out.println(nomeUsuario.toUpperCase());
        System.out.println(nomeUsuario.toLowerCase());
        System.out.println(nomeUsuario);
        System.out.println("       Testando o Trim       ".trim());
        System.out.println("João.".equals("joão"));
        System.out.println("João".equalsIgnoreCase("joão"));
        System.out.println("João".charAt(2));
        System.out.println("João".indexOf('o'));
        System.out.println("João".indexOf('v'));
        System.out.println("João".lastIndexOf('o'));
        System.out.println("testando".replace('t', 'T'));

        String nome = "João Vitorio";
        int indexDoEspaco = nome.indexOf(" ");

        System.out.println(nome.substring(indexDoEspaco+1));

        String idadeStr = Integer.toString(idade); //"32"
        //conversão inversa
        double peso = Double.parseDouble("10.5");

        System.out.println(idadeStr);
        System.out.println(peso);

    }
}
