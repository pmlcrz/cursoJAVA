
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
