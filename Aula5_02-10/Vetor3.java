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


/*leia o nome e a idade de 5 pessoas em vetor,
ao final mostrar o nome e a idade de todos.*/

public class Vetor3 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int idade [] = new int [5]; 
        String[] nome = new String [5];
        
        
        for (int i = 0; i < 4; i++) {

        System.out.print("Digite seu nome: ");

        nome [i] = sc.next();
        
        
        System.out.print("Digite sua idade: ");
        
        idade[i] = sc.nextInt(); 
        
        
        }

       for (int i = 0; i < 4; i++) {
           
  System.out.println("********Dados da "+(i+1)+"a Pessoa****** ");
           System.out.println("Nome = "+nome[i]);
           System.out.println("Idade = "+idade[i]);      
       }
       }

    }

    

