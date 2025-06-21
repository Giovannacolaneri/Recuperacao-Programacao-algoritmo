import java.util.Scanner;

public class Ex15 {
      public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("******Simulador de caixa eletronico******");

        System.out.println("escolha as opcoes (1 para saque, 2 para deposito e 3 para saldo)");
         System.out.print("digite a opcao desejada:");
        int opcao = scanner.nextInt();
        int deposito;


        
        switch(opcao){
            case 1:
             
               break;
            case 2:

               break;
            case 3:
            System.out.println("Quanto voce deseja depositar?");
            deposito = scanner.nextInt();
               break;
            default:
               System.out.println("opcao nao identificada"); 
               break;

           
        }
scanner.close();

      }
}