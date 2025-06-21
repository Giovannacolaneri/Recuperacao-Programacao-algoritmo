import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa que verifica se um numero é primo");
        System.out.print("Digite um número para verificar se é primo: ");
        int numero = scanner.nextInt();
        int divisores = 0; 
        
        
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                divisores++;
}
 }


        if (divisores == 2) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " NÃO é um número primo.");
        }

  scanner.close();
    }
}
