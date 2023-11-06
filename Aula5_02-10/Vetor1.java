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


//leia o nome de 5 usuários em vetor e ao final imprimatodos os nomes na tela.
public class Vetor1 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome [] = new String [5]; 
        
        for (int i = 0; i < 4; i++) {

        System.out.print("Digite seu nome: ");
        nome[i] = sc.next(); 

        }

       for (int i = 0; i < 4; i++) {
           
           System.out.println("Nome" +(i+1)+ " = " +nome[i]);   
       }
       }

    }

    

