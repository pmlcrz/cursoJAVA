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
public class DadosComImc {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        

        String nome;
        Double idade, peso, imc, altura;
        
        System.out.println("Digite seu nome");
        
        sc.nextLine();
        
        System.out.println("Digite sua idade");
        
        sc.nextDouble();
        
         System.out.println("Digite seu peso");
          
            peso = sc.nextDouble();
            
      
        System.out.println("Digite sua altura");
        
            altura = sc.nextDouble();
            
    
               imc = peso / (altura*altura);
               
          
      
        if (imc <= 18.5){
            System.out.println ("Sua Classificação foi = "+imc+ "😔Abaixo do peso normal!😔");
        }else if ((imc > 18.5) &&(imc <24.9)){
                System.out.println ("Sua Classificação foi = "+imc+ "✔️Voce esta no peso ideal!✔️");
        }else if ((imc > 25.0)&& (imc <29.9)){
                    System.out.println("Sua Classificação foi = "+imc+ "⚠️Voce está com excesso de peso⚠️");
        }else if ((imc > 30.0) && (imc <34.9)){
                   System.out.println("Sua Classificação foi = "+imc+ "🚨Obesidade tipo I!🚨");
        }else if ((imc > 35.0) && (imc <39.9)){
                System.out.println ("Sua Classificação foi = "+imc+ "🚨🚨Obesidade tipo II!🚨🚨");
        }else if (imc >= 40){
            System.out.println ("Sua Classificação foi = "+imc+ "🚨🚨🚨Obesidade tipo III!🚨🚨🚨");
        }
           
    }
               
    }
 
        
