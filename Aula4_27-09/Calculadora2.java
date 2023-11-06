/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulatres;

import java.util.Scanner;

/**
 *
 * @author 16128972023.1
 */

/*Um programa que que leia um número 
qualquer e calcule sua tabuada de multiplicar */

public class Calculadora2 {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o número da tabuada");
        int tabuada = sc.nextInt();
         
        int total; // armazena o resultado da multiplic
        
        for (int i = 1; i <= 10; i++) {
            total = tabuada * i; // faz o calculo
            System.out.println(tabuada + " x " + i + " = " + total); // exibe o resultado
        }

        sc.close(); // 
    }
}
