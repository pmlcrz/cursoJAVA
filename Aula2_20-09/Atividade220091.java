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
public class Atividade220091 { //Atividade para verificar se alguém é maior ou menor de idade
    
        public static void main(String[] args) {

            Double n1,n2,n3,n4,media;
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite a nota do 1° bim");
            n1 = sc.nextDouble();
            
            System.out.println("Digite a nota do 2° bim");
            n2 = sc.nextDouble();
            
            System.out.println("Digite a nota do 3° bim");
            n3 = sc.nextDouble();
            
            System.out.println("Digite a nota do 4° bim");
            n4 = sc.nextDouble();
            
            media = (n1+n2+n3+n4)/4;
           
            if (media>=6){
                System.out.println("Aluno aprovado! - média ="+media);
            } else {
                System.out.print("Aluno reprovado! -média ="+media );
            }
                    
        }
    
}
