import java.util.Scanner;

public class MediaIdades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somaIdades = 0; 

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();
            somaIdades += idade; 
        }

        double mediaIdades = (double) somaIdades / 20; 

        System.out.println("A média das idades é: " + mediaIdades);
        scanner.close();
    }
}
