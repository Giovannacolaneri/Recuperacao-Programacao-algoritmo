import java.util.Scanner;

public class Ex18 {
      public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("******Programa de conversor de medidas******");
        System.out.println("1 - KM para M");
        System.out.println("2 - M para CM");
        System.out.println("3 - CM para MM");
        System.out.println("4 - M para KM");
        System.out.println("5 - CM para M");
        System.out.println("6 - MM para CM");
        


        System.out.println("Escolha uma opção:");
        int opcao = scanner.nextInt();
        System.out.println("Digite o valor que deseja converter:");
        double valor = scanner.nextDouble();
        double resultado;
        
        
        switch(opcao){
            case 1:
            resultado = valor * 1000;
              System.out.println("O resultado é: " + resultado +"m");
              break;
            case 2:
            resultado = valor * 100;
              System.out.println("O resultado é"+ resultado +"cm");
              break;
            case 3:
             resultado = valor * 10;
              System.out.println("O resultado é" + resultado + "mm");
              break;
            case 4:
            resultado = valor / 1000;
              System.out.println("O resultado é: " + resultado + "km");
              break;
            case 5:
            resultado = valor / 100;
              System.out.println("O resultado é"+ resultado + "m");
              break;
            case 6:
             resultado = valor / 10;
              System.out.println("O resultado é" + resultado + "cm" );
              break;
            default:
              System.out.println("Opcao desconhecida" );
              break;
        }
scanner.close();
        



      }



}