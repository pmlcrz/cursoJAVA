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
import java.util.Scanner;

public class Calculadora3 {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        
        int i, calc, total;
        
        System.out.println("Digite o número da tabuada");
        calc = sc.nextInt();
         
        i = 1;
        while (i <= 10) {
            total = calc * i; // Calcula a tabuada
            System.out.println(calc + " x " + i + " = " + total); // Exibe o resultado
            i++;
        }
        
        sc.close();
    }
}
