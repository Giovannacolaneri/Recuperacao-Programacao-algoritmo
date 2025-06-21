import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Programa de matriz 2x2:");
        Scanner scanner = new Scanner(System.in);
        int[][] numeros = new int[2][2];
        System.out.println("Escreva os numeros da matriz 2x2:");
        for (int linha = 0; linha < 2; linha++) {
            for (int coluna = 0; coluna < 2; coluna++) {
                numeros[linha][coluna] = scanner.nextInt();
 } }
        System.out.println("Matriz 2x2:");
        for (int linha = 0; linha < 2; linha++) {
            for (int coluna = 0; coluna < 2; coluna++) {
                System.out.print(numeros[linha][coluna] + " ");
            }
            System.out.println();
}
                scanner.close();

 }
}
    

        

    
    
        

    

    
