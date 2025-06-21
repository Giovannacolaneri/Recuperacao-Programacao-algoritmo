import java.util.Scanner;

public class EX14 {

      public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("******Programa que fala o mes a partir do numero 1 a 12******");

        System.out.println("Digite um numero de 1 a 12:");
        int mes = scanner.nextInt();

        switch(mes){
            case 1:
              System.out.println("Mes = Janeiro");
              break;
            case 2:
              System.out.println("Mes = Fevereiro ");
              break;
            case 3:
              System.out.println("Mes = Marco");
              break;
            case 4:
              System.out.println("Mes = Abril");
              break;
            case 5:
              System.out.println("Mes = Maio");
              break;
            case 6:
              System.out.println("Mes = Junho");
              break;
            case 7:
              System.out.println("Mes = Julho");
              break;
            case 8:
              System.out.println("Mes = Agosto");
              break;
            case 9:
              System.out.println("Mes = Setembro");
              break;
            case 10:
              System.out.println("Mes = Outubro");
              break;
            case 11:
              System.out.println("Mes = Novembro");
              break;
            case 12:
              System.out.println("Mes = Dezembro");
              break;
            default:
              System.out.println("Mes desconhecido.");
              break;
        }
              
scanner.close();
        



      }



}

