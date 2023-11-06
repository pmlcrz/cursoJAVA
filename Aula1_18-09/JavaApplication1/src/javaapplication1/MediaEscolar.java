/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * PROGRAMA PARA LER DUAS NOTAS DE UM ALUNO E CALCULAR SUA MÉDIA
 */
public class MediaEscolar {
    
        public static void main(String[] args) {

    
    Double nota1, nota2, media;
    
    Scanner sc = new Scanner(System.in);
    
     System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
    
        System.out.println("Digite a segunda nota");
        nota2 = sc.nextDouble();
        
        media = nota1 + nota2;
        
        System.out.println("Resultado da média" +media);
    
        }
}
