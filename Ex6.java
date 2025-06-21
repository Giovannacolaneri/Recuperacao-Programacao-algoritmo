import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int contador = 0;
        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i=0; i<3; i++) {
            for (int n = 0; n < 3; n++) {
                matriz[i][n]=scanner.nextInt();

                if (matriz[i][n]>10) {
                    contador++;
    }
}
 }

    
        System.out.println("Quantidade de elementos maiores que 10: "+contador);

        scanner.close();
 }
}
