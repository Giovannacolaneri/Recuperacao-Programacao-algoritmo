import java.util.Scanner;

public class Ex22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa le 5 numeros e os soma:");
        int n;
        int soma = 0;
        for(int i = 0; i < 5; i++){
            n = scanner.nextInt();
            soma += n;
        }
        System.out.println("A soma dos 5 numeros eh: "+ soma);
scanner.close();
}
}