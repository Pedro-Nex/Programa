import java.util.Scanner;
public class Conversor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final double DOLAR = 5.10;
        final double EURO = 6.10;
        final double LIBRA = 7.10;
        final double PESO_ARGENTINO = 8.10;
        final double PESO_CHILENO = 9.10;
        final double PESO_COLOMBIANO = 10.10;
        final double PESO_URUGUAIO = 11.10;
        final double PESO_PARAGUAIO = 12.10;

        System.out.println("*** Bem vindo ao Conversor de Moedas ***");

        System.out.print("Digite o seu nome: ");
        String nome = scan.nextLine();
        System.out.print("Digite a sua idade: ");
        int idade = scan.nextInt();
        scan.nextLine();

        if (idade < 18) {
            System.out.println(nome + ", você não pode converter moedas.");
            return;
        }

        System.out.print(nome + ", digite a quantidade de reais que você deseja converter: ");
        double valor = scan.nextDouble();
        scan.nextLine();

        System.out.print(nome + ", digite a moeda para a qual você deseja converter: ");
        String moeda = scan.nextLine();

        if (moeda.equalsIgnoreCase("DOLAR")) {
            double valorConvertido = valor / DOLAR;
            System.out.println("O valor convertido para Dólar é: " + String.format("%.2f", valorConvertido));
        } else if (moeda.equalsIgnoreCase("EURO")) {
            double valorConvertido = valor / EURO;
            System.out.println("O valor convertido para Euro é: " + String.format("%.2f", valorConvertido));
        } else if (moeda.equalsIgnoreCase("LIBRA")) {
            double valorConvertido = valor / LIBRA;
            System.out.println("O valor convertido para Libra é: " + String.format("%.2f", valorConvertido));
        } else if (moeda.equalsIgnoreCase("PESO_ARGENTINO")) {
            double valorConvertido = valor / PESO_ARGENTINO;
            System.out.println("O valor convertido para Peso Argentino é: " + String.format("%.2f", valorConvertido));
        } else if (moeda.equalsIgnoreCase("PESO_CHILENO")) {
            double valorConvertido = valor / PESO_CHILENO;
            System.out.println("O valor convertido para Peso Chileno é: " + String.format("%.2f", valorConvertido));
        } else if (moeda.equalsIgnoreCase("PESO_COLOMBIANO")) {
            double valorConvertido = valor / PESO_COLOMBIANO;
            System.out.println("O valor convertido para Peso Colombiano é: " + String.format("%.2f", valorConvertido));
        } else if (moeda.equalsIgnoreCase("PESO_URUGUAIO")) {
            double valorConvertido = valor / PESO_URUGUAIO;
            System.out.println("O valor convertido para Peso Uruguaio é: " + String.format("%.2f", valorConvertido));
        } else if (moeda.equalsIgnoreCase("PESO_PARAGUAIO")) {
            double valorConvertido = valor / PESO_PARAGUAIO;
            System.out.println("O valor convertido para Peso Paraguaio é: " + String.format("%.2f", valorConvertido));
        } else {
            System.out.println("Moeda inválida");
        }

        scan.close();
    }
}