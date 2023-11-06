/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula4;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author 16128972023.1
 */


public class ExercicioMatriz {    
   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int num [] [] = new int [5] [2];
        
        for (int i=0; i<=4; i++){
            for (int j=0; j<=1; j++){
                
                System.out.println("Digite um numero: ");
                
                
               num[i][j] = sc.nextInt();
  }
      }
            System.out.println("o dobro dos numeros armazenados é:");
            

            for (int i=0; i<=4; i++){
                System.out.println("");
            for (int j=0; j<=1; j++){
                System.out.print(num[i][j]*2+" ");            
                    
            }  
        }

     }
    }
    

