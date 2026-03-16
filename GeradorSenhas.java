import java.util.Scanner;
import java.util.Random;
public class GeradorSenhas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";

        System.out.println("*** Bem vindo ao Gerador de Senhas ***");

        System.out.print("Digite o tamanho da senha: ");
        int tamanho = scan.nextInt();
        scan.nextLine();

        String senha = "";

        for (int i = 0; i < tamanho; i++) {
            int sorteio = random.nextInt(caracteres.length());
            senha += caracteres.charAt(sorteio);
        }

        System.out.println("A senha gerada é: " + senha);

        scan.close();
    }
}