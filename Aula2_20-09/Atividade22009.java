/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author 16128972023.1
 */
public class Atividade22009 { //Atividade para verificar se alguém é maior ou menor de idade
    
        public static void main(String[] args) {

            int idade;
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite sua idade");
            idade = sc.nextInt();
            
            if (idade >=18){
                System.out.println("Você é maior de idade");
            } else {
                System.out.println("Você é menor de idade");
            }
        }
    
}
