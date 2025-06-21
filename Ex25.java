import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1 = 0;
        
        System.out.println("Programa que le 10 numeros e mostra o maior:");
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número: ");
            double n = scanner.nextDouble();
          if (i == 1 || n > n1) {
                n1 = n;
}
}
        System.out.println("O maior número é: " + n1);
        scanner.close();
    }
}
