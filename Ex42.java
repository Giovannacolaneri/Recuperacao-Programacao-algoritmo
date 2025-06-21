import java.util.Scanner;

public class Ex42{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa que le numeros positivos");
        int contador = 0;
        int n =0;
            do{
              System.out.println("Digite um numero positivo (negativo se quiser parar)");
              n = scanner.nextInt();
              if (n>=0){
                contador = contador + 1;
              }
              
            } while (n>=0);
            System.out.println("A quantidade de numeros positivos eh: " + contador);

scanner.close();
    }
}