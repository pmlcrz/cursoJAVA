package teste.homework0210;

import java.util.Scanner;

public class exercicio2vetor {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        double soma = 0;
        int qtd = 5; 
        System.out.println("Digite " +qtd + " numeros:");

        double[] numeros = new double[qtd]; 

        for (int i = 0; i < qtd; i++) {
            System.out.print("Numero " + (i+1) + ": ");
            double numero = sc.nextDouble();
            numeros[i] = numero;
            soma += numero;
        }

        System.out.println("A soma dos números é: " + soma);

        System.out.println("");
        for (int i = 0; i < qtd; i++) {
            System.out.println(numeros[i]);
        }

    }
}
