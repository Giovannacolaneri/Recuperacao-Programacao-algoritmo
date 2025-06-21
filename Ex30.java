import java.util.Scanner;

public class Ex30 {

    

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa da sequência Fibonacci");

        System.out.print("Digite quantos números da sequência de Fibonacci deseja ver: ");
        int n = scanner.nextInt(); 

        int primeiro = 0;  
      int segundo = 1; 

        System.out.println("Sequência de Fibonacci com " + n + " números:");

        for (int i = 0; i < n; i++) {
            System.out.print(primeiro + " "); 

            int proximo = primeiro + segundo; 
            primeiro = segundo;               
            segundo = proximo;                }

        scanner.close();
    }
}