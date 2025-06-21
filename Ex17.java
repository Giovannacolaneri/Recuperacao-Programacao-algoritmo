import java.util.Scanner;

public class Ex17 {
      public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("******Programa de calculadora simples******");

        System.out.println("Digite numero 1:");
        double n = scanner.nextDouble();
        System.out.println("Digite numero 2:");
        double n2 = scanner.nextDouble();
        System.out.println("Digite a operação (-,+,*,/):");
        char operacao = scanner.next().charAt(0);
        
        
        switch(operacao){
            case '+':
              System.out.println("O resultado é"+ (n+n2) );
              
              break;
            case '-':
              System.out.println("O resultado é"+ (n-n2) );
              break;
            case '*':
              System.out.println("O resultado é"+ (n*n2) );
              break;
            case '/':
              System.out.println("O resultado é"+ (n/n2) );
              break;
            default:
              System.out.println("Operacao desconhecida.");
              break;
        }
scanner.close();
        



      }



}