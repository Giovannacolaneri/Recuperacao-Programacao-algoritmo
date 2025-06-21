import java.util.Scanner; 

public class Ex28{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Programa que calcula o fatorial do numero que o usuario escolhe");
        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt(); 
        int fatorial = 1; 

        for (int i= numero; i >= 1; i--) {
            fatorial *=i;
        }

        System.out.println("O fatorial de " + numero + " é: " +fatorial);
        
        scanner.close(); 
    }
}
