/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulatres;

import java.util.Scanner;

/**
 *
 * @author 16128972023.1
 */
public class DadosComImcCorrigido {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        

        String nome, classif = null;
        Double peso, imc, altura;
        int idade;
        
        System.out.println("Digite seu nome: ");
        
        nome = sc.next();
        
        System.out.println("Digite sua idade: ");
        
        idade = sc.nextInt();
        
         System.out.println("Digite seu peso: ");
          
            peso = sc.nextDouble();
            
      
        System.out.println("Digite sua altura:");
        
            altura = sc.nextDouble();
            
    
               imc = peso / (altura*altura);
               
          
      
        if (imc<=18.5){
            classif = "😔Abaixo do peso normal!😔";
        }else if (imc <24.9){
                classif = "✔️Voce esta no peso ideal!✔️";
        }else if (imc <29.9){
                   classif = "⚠️Voce está com excesso de peso⚠️";
        }else if (imc <34.9){
                classif = "🚨Obesidade tipo I!🚨";
        }else if ((imc > 35.0) && (imc <39.9)){
                classif = "🚨🚨Obesidade tipo II!🚨🚨";
        }else if (imc >= 40){
            classif = "🚨🚨🚨Obesidade tipo III!🚨🚨🚨";
        }
        
        /*
        Para fazer para mais de uma pessoa em loop:
        
        for(int i=1; i<=3;i++) { 
        
            fechar no fim de tudo}*/
        
           System.out.println("Nome ="+nome+ "Idade ="+idade);
           
           System.out.println("Peso ="+peso+ "Altura ="+altura);
           
           System.out.println("Seu imc é ="+imc);
           
           System.out.println("Sua classificação é ="+classif);
    }
               
    }
 
        
