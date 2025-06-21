import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("Programa de 5 vetores.");
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        System.out.println("Escreva 5 numeros:");
    
        for(int i = 0; i < numeros.length; i++){
           System.out.println(" numero "+ (i+1)+ ": ");
           numeros[i] = scanner.nextInt();}

        System.out.println("Os números digitados foram:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);


        }
scanner.close();

    }

    
}