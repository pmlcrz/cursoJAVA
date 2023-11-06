/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula4;

import java.util.Scanner;

/**
 *
 * @author 16128972023.1
 */



public class ExercicioVetor {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numvet [] = new int [5];         
        
        for (int i = 0; i < 5; i++) {
        
        System.out.print("Digite um número: ");
        
        numvet[i] = sc.nextInt(); 
        
        
        }

       for (int i = 0; i < 5; i++) {
              System.out.println("Dobro dos numeros armazenados = "+numvet[i]*2);      
       }
       }

    }

    

