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

public class Pesquisa {
    public static void main(String[] args) {        
        Scanner sc=new Scanner(System.in);
        int idade,qttotal,qth,qtm;
        String nome,sexo,resp,inicio;        
        qttotal=0;
        qth=0;
        qtm=0;
       
        System.out.println("Deseja Participar da pesquisa?");
        inicio=sc.next();
       
        while(inicio.equals("S")|inicio.equals("s")|inicio.equals("sim")|inicio.equals("Sim")){
            System.out.println("Digite Nome: ");
            nome=sc.next();            
            System.out.println("Digite Idade: ");
            idade=sc.nextInt();            
            System.out.println("Digite Sexo: ");
            sexo=sc.next();            
            System.out.println("Gostou do Produto? ");
            resp = sc.next();
           
             qttotal++;
             
             if(sexo.equals("M")|sexo.equals("m")|sexo.equals("Masculino")|sexo.equals("masculino")){
                 qth++;
             }else if(sexo.equals("F")|sexo.equals("f")|sexo.equals("Feminino")|sexo.equals("femininino")){
                 qtm++;
             }           
             
              System.out.println("Deseja Participar da pesquisa?");
              inicio=sc.next();                 
           
        }  
       
       
        System.out.println("Quantidade de Participantes = "+qttotal);
        System.out.println("Quantidade de Homens = "+qth);
        System.out.println("Quantidade de Mulheres = "+qtm);            
   
}
}
