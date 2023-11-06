import java.util.Scanner;

public class MaioresIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorMaioresDeIdade = 0; // Inicializamos o contador de maiores de idade com 0

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();

            if (idade >= 18) {
                contadorMaioresDeIdade++; // Incrementamos o contador se a idade for maior ou igual a 18
            }
        }

        System.out.println("O número de pessoas maiores de idade é: " + contadorMaioresDeIdade);
        scanner.close();
    }
}
