package estruturaderepeticao;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //cria um ArrayList chamando o construtor classe
        ArrayList nomes = new ArrayList();
        //assim adiciona elementos na nossa ArrayList
        nomes.add("Leonardo");
        nomes.add("André");
        nomes.add("Maria");

        nomes.add(0, "João");

        System.out.println(nomes);

        // se qusier percorrer o ArrayLIst é possível percorrer com for, for.each como no Array;
    }
}
