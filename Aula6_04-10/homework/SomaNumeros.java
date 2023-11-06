public class SomaNumeros {
    public static void main(String[] args) {
        int soma = 0; // Inicializamos a variável soma com 0

        // Loop para somar os números de 1 a 15
        for (int i = 1; i <= 15; i++) {
            soma += i; // Adicionamos o valor atual de i à soma
        }

        // Exibimos o resultado da soma
        System.out.println("A soma dos números de 1 a 15 é: " + soma);
    }
}
