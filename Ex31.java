import java.util.Scanner;

public class Ex31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa que lê numeros ate o zero ser digitado e que mostra a soma dos numeros.");
        int n=1;
        int soma=0;
        while (n != 0) {
            System.out.println("Digite o numero:");
            n = scanner.nextInt();
            soma+= n;
        }
        System.out.println("soma="+soma);
scanner.close();
    }
    
}
