import java.util.Scanner;

public class ClassificacaoDeNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contadorEntreZeroECem = 0; 
        int contadorEntreCemE200 = 0; 
        int contadorMaioresQueDuzentos = 0; 

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = sc.nextInt();

            if (numero >= 0 && numero <= 100) {
                contadorEntreZeroECem++; 
            } else if (numero >= 101 && numero <= 200) {
                contadorEntreCemE200++; 
            } else {
                contadorMaioresQueDuzentos++; 
            }
        }

        System.out.println("Números entre 0 e 100: " + contadorEntreZeroECem);
        System.out.println("Números entre 101 e 200: " + contadorEntreCemE200);
        System.out.println("Números maiores que 200: " + contadorMaioresQueDuzentos);
    }
}
