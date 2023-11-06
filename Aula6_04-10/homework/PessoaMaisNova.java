import java.util.Scanner;

public class PessoaMaisNova {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeMaisNovo = ""; // Inicializamos o nome da pessoa mais nova com uma string vazia
        int idadeMaisNova = Integer.MAX_VALUE; // Inicializamos a idade da pessoa mais nova com o maior valor possível

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o nome da pessoa " + i + ": ");
            String nome = scanner.next();
            
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();

            if (idade < idadeMaisNova) {
                idadeMaisNova = idade; // Atualizamos a idade da pessoa mais nova
                nomeMaisNovo = nome; // Atualizamos o nome da pessoa mais nova
            }
        }

        System.out.println("A pessoa mais nova é: " + nomeMaisNovo);
        scanner.close();
    }
}
