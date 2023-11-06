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


//leia 10 números inteiros e ao final, mostre os numeros lidos.

public class Vetor2 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numvetor [] = new int [10]; 
        
        for (int i = 0; i < 9; i++) {

        System.out.print("Digite um numero: ");
        numvetor[i] = sc.nextInt(); 

        }

       for (int i = 0; i < 9; i++) {
           
           System.out.println("Numero[" +(i+1)+ "] = " +numvetor[i]);   
       }
       }

    }

    

