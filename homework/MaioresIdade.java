import java.util.Scanner;

public class MaioresIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contadorMaioresDeIdade = 0; 

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = sc.nextInt();

            if (idade >= 18) {
                contadorMaioresDeIdade++; 
            }
        }

        System.out.println("O número de pessoas maiores de idade é: " + contadorMaioresDeIdade);
    }
}
