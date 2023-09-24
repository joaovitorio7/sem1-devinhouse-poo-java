package estruturaderepeticao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestaArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //cria um ArrayList chamando o construtor classe
        ArrayList<String> nomes = new ArrayList<>();
        //assim adiciona elementos na nossa ArrayList
        nomes.add("Leonardo");
        nomes.add("André");
        nomes.add("Maria");
//        nomes.add(123);

        nomes.add(0, "João");

        System.out.println(nomes);

        // tamanho da arraylist
        System.out.println(nomes.size());

        String nome = nomes.get(0);

        // saber se existe ou não o elemento na Array
        System.out.println(nomes.contains("Leonardo"));

        // método para remover um elemento
        nomes.remove("Leonardo");
        System.out.println(nomes);

        System.out.println(nomes.contains("Leonardo"));

        // ordenar em ordem alfabética
        // A classe Collections traz grande qtd de métodos estáticos úteis na manip. de coleções
        Collections.sort(nomes);
        System.out.println(nomes);

        System.out.println(Collections.max(nomes));
        System.out.println(Collections.min(nomes));

        // reverte a lista, faz o contrário do sort que ordena
        Collections.reverse(nomes);
        System.out.println(nomes);

        ArrayList anosCopa = new ArrayList();

        // se qusier percorrer o ArrayLIst é possível percorrer com for, for.each como no Array;
    }
}
