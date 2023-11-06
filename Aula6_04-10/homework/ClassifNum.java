import java.util.Scanner;

public class ClassificacaoDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorEntreZeroECem = 0; // Inicializamos o contador com 0
        int contadorEntreCemE200 = 0; // Inicializamos o contador com 0
        int contadorMaioresQueDuzentos = 0; // Inicializamos o contador com 0

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = scanner.nextInt();

            if (numero >= 0 && numero <= 100) {
                contadorEntreZeroECem++; // Incrementamos o contador se o número estiver entre 0 e 100
            } else if (numero >= 101 && numero <= 200) {
                contadorEntreCemE200++; // Incrementamos o contador se o número estiver entre 101 e 200
            } else {
                contadorMaioresQueDuzentos++; // Incrementamos o contador se o número for maior que 200
            }
        }

        System.out.println("Números entre 0 e 100: " + contadorEntreZeroECem);
        System.out.println("Números entre 101 e 200: " + contadorEntreCemE200);
        System.out.println("Números maiores que 200: " + contadorMaioresQueDuzentos);
        scanner.close();
    }
}
