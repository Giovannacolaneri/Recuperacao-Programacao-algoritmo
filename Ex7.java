import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor1= new int[5];
         int[] vetor2= new int[5];
         int[] soma= new int[5];

        System.out.println("Digite os 5 valores do primeiro vetor:");
         for(int i = 0; i < 5; i++){
             vetor1[i] = scanner.nextInt();
        }
        System.out.println("Digite os 5 valores do segundo vetor:");
        for (int i = 0; i < 5; i++) {
            vetor2[i] = scanner.nextInt();
        }
         for (int i = 0; i < 5; i++) {
            soma[i] = vetor1[i] + vetor2[i];
        }

        System.out.println("Vetor resultado da soma:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Soma[" +i+ "] =" +soma[i]);
    }

        scanner.close();
}
}
