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
public class Aula0201 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome; 
        
        for (int i = 0; i < 5; i++) {

        System.out.print("Digite seu nome: ");
        nome = sc.next(); 

        System.out.println("Nome"+i+" = "+nome);
        }

    }
}
    

