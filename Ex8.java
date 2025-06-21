import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int contador = 0;

        System.out.println("Digite os elementos da matriz 4x4:");
        for (int i=0; i<4; i++) {
            for (int n=0; n<4; n++) {
                System.out.print("Elemento [" +i+ "][" +n+ "]: ");
                matriz[i][n] = scanner.nextInt();

                if (matriz[i][n] % 2 == 0) {
                    contador++;
                }
            }
        }

        System.out.println("Quantidade de números pares na matriz: " + contador);

        scanner.close();
    }
}
