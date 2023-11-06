import java.util.Scanner;

public class NumerosEntre0E100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorEntreZeroECem = 0; // Inicializamos o contador com 0

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = scanner.nextInt();

            if (numero >= 0 && numero <= 100) {
                contadorEntreZeroECem++; // Incrementamos o contador se o número estiver entre 0 e 100
            }
        }

        System.out.println("O número de números entre 0 e 100 é: " + contadorEntreZeroECem);
        scanner.close();
    }
}
