import java.util.Scanner;

public class RepetirNome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine(); // Lê o nome do usuário

        System.out.print("Digite um número N: ");
        int N = scanner.nextInt(); // Lê o número N

        // Loop para exibir o nome N vezes
        for (int i = 0; i < N; i++) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
