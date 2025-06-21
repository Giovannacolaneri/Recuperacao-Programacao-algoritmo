
import java.util.Scanner;

public class Ex12 {
      public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("******Programa que fala Dias da Semana a partir de um numero de 1 a 7******");

        System.out.println("Digite um numero de 1 a 7:");
        int numero = scanner.nextInt();

        switch(numero){
            case 1:
              System.out.println("Dia da semana:Domingo");
              break;
            case 2:
              System.out.println("Dia da semana:Segunda-feira");
              break;
            case 3:
              System.out.println("Dia da semana:Terça-feira");
              break;
            case 4:
              System.out.println("Dia da semana:Quarta-feira");
              break;
            case 5:
              System.out.println("Dia da semana:Quinta-feira");
              break;
            case 6:
              System.out.println("Dia da semana:Sexta-feira");
              break;
            case 7:
              System.out.println("Dia da semana:Sabado");
              break;
            default:
              System.out.println("Dia da semana desconhecido.");
              break;
        }
              
scanner.close();
        



      }



}

