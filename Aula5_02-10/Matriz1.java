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


/*leia 9 números inteiros em uma matriz 3x3, ao final,
imprima os valores armazenados.*/

public class Matriz1 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int numeros [] [] = new int [3] [3];
        
        for (int i=0; i<=2; i++){
            for (int j=0; j<=2; j++){
                
                System.out.println("Digite um numero: ");
                
                
                numeros[i][j] =  sc.nextInt();
 
            }
        }
            
            
            System.out.println("Números armazenados na matriz de dados");
            

            for (int i=0; i<=2; i++){
                System.out.println("");
            for (int j=0; j<=2; j++){
                System.out.print(numeros[i][j]+" ");
                
                
                
            }  
        }

     }
    }
    

