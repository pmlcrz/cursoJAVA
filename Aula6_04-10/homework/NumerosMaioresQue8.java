import java.util.Scanner;

public class NumerosMaioresQue8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorMaioresQueOito = 0; // Inicializamos o contador com 0

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = scanner.nextInt();

            if (numero > 8) {
                contadorMaioresQueOito++; // Incrementamos o contador se o número for maior que 8
            }
        }

        System.out.println("O número de números maiores que 8 é: " + contadorMaioresQueOito);
        scanner.close();
    }
}
