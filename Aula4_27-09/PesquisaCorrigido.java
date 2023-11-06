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

/*Crie um programa para guardar os dados de uma pesquisa 
de uma empresa que está testando um produto novo no mercado. 
São guardados o nome, idade sexo e a resposta (sim ou não) 
se gostaram do produto que experimentaram.

Não se sabe a quantidade de pessoas que responderam a pesquisa.

Ao final o programa deve responder:

Quantidade de pessoas que responderam a pesquisa
Quantidade de homens e quantidades mulheres*/

public class PesquisaCorrigido {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        

        String nome, sexo, resp, inicio;
        int idade, qtdtotal, qtdmasc, qtdfem;
        
        qtdtotal = 0;
        qtdmasc = 0;
        qtdfem = 0 ;

        
        
        System.out.println("Vamos dar inicio a pesquisa? Responda 'S' para sim ou 'N' para não");
        inicio = sc.next();
        
        while (inicio.equals("S")|inicio.equals("s")){
            
        System.out.println("Digite seu nome: ");
        
        nome = sc.next();
        
        
        System.out.println("Digite sua idade: ");
        
        idade = sc.nextInt();
        
        

         System.out.println("Digite seu sexo: ");
          
            sexo = sc.next();
        
            
            System.out.println("O produto foi do seu agrado?");
            resp = sc.next();
         
            qtdtotal++;
            
        if (sexo.equals("fem")| sexo.equals("masc")){
         qtdmasc++;       
        } else if (sexo.equals("fem")| sexo.equals("masc")){
            qtdfem++;
        }
        
           System.out.println("Nome= "+nome);
           
           System.out.println("Idade= "+idade);

           System.out.println("Sexo= "+sexo);
           
                     
        
            System.out.println("Quatidade de pessoas que responderam: " +qtdtotal);
            System.out.println("Quatidade de homens: " +qtdmasc);
            System.out.println("Quatidade de mulheres: " +qtdfem);



        }
               
    }
 
        
}

