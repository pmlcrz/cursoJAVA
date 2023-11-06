
package javaapplication1;
import java.util.Scanner;
public class MediaEscolar {    
    public static void main(String[] args) {    
    Double nota1,nota2,media;    
    Scanner sc = new Scanner(System.in);                 
        System.out.println("Digite a Primeira Nota: ");
        nota1 = sc.nextDouble();        
        System.out.println("Digite a Segunda Nota: ");
        nota2 = sc.nextDouble();        
        media = (nota1 + nota2)/2;        
        System.out.println("Media do Aluno = "+media);      
}
}
