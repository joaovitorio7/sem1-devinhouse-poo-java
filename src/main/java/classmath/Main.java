package classmath;

public class Main {
    public static void main(String[] args) {

        double resultPow = Math.pow(5,2);
        System.out.printf("Potência de 5²: %.2f%n", resultPow);

        double raizQuadrada = Math.sqrt(25);
        System.out.println(raizQuadrada);

        double raizCubica = Math.cbrt(27);
        System.out.println(raizQuadrada);

        int resultAbs = Math.abs(-10);
        System.out.println(resultAbs);

        double floor = Math.floor(19.9);
        System.out.println(floor);

        double ceil = Math.ceil(20.1);
        System.out.println(ceil);

        double round = Math.round(20.5);
        System.out.println(round);

        System.out.println(Math.PI);
        System.out.println(Math.random());

        double aleatorio = Math.random() * (100-10) + 10;
        System.out.printf("Número aleatório entre 100 e 10: %.2f%n", aleatorio);

        int intAleatorio = (int) aleatorio;
        System.out.printf("Número aleatório inteiro: %d%n", intAleatorio);

        // Operadores Relacionais e Lógicos:

        String str1 = new String("str");
        String str2 = new String("str");

        //quando for comparar string sempre usar o equals nunca o ==

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        //ver essa estruturação como um não igual fica mais fácil de ler, ver como uma negação:
        System.out.println("srt1 é diferente de str2?: " + !str1.equals(str2));

        //se duas operações são verdadeiras AO MESMO TEMPO o resultado é verdadeiro
        System.out.println((5>3) && (8==9)); // E
        System.out.println((9!=9) || (10>=10)); // OU
    }
}
