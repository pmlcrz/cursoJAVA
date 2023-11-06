public class CalcularSalarioFunc {
        
    public static void main(String[] args) {
 
 
    Scanner sc = new Scanner(System.in);
 
    String NomeFunc;
    Double horastrab,valorhora,salario;
 
   System.out.println("Nome do funcionário: ");
    NomeFunc = sc.next(); 
    
    System.out.println("Horas Trabalhadas: ");
    horastrab = sc.nextDouble(); 
    
    System.out.println("Valor horas trabalhadas: ");
    valorhora = sc.nextDouble(); 
         
    salario = horastrab * valorhora;
         
    System.out.println("Salário mensal do funcionario= "+salario);
   

}
}
