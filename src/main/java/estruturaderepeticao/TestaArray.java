package estruturaderepeticao;

public class TestaArray {
    public static void main(String[] args) {
        int[] anosCopa = {2022, 2018, 2014, 2010, 2006, 2002};

        String[] nomes = new String[5];
        nomes[0] = "Marcelo";
        nomes[1] = "Alvaro";
        nomes[2] = "Augusto";
        nomes[3] = "Henrique";
        nomes[4] = "Marconi";

        System.out.println(nomes);

        System.out.println(anosCopa);
        for (int i = 0; i< anosCopa.length; i++){
            System.out.println(anosCopa[i]);

            for (String nome : nomes) {
                System.out.println(nome);
            }
        }
    }
}
