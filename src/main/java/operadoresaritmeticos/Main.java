package operadoresaritmeticos;

public class Main {
    public static void main(String[] args) {
        int idade = 32;
        System.out.println(idade +1);
        System.out.println("Minha idade é: " + idade + 1);
        System.out.println("Minha idade é: " + (idade + 1));
        System.out.printf("Minha idade é: %d.%n", idade + 1);

        double peso = 85.5;
        peso = peso - 2;

        System.out.println("Meu peso é: " + peso);

        double preco = 5.2;
        int quantidade = 3;

        double valorTotalCompra = preco * quantidade;
        System.out.printf("Valor pago: R$%.2f%n", valorTotalCompra);

        int qtdPessoas = 2;
        double valorPagoPorPessoa = valorTotalCompra / qtdPessoas;

        System.out.printf("Valor pago por pessoa: R$%.2f%n", valorPagoPorPessoa);

        double restoDaDivisao = valorTotalCompra % qtdPessoas;
        System.out.printf("Resto da divisão do valor por pessoa: %.2f", restoDaDivisao);


    }
}
