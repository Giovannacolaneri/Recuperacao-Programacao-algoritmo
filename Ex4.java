import java.util.Scanner;

public class Ex4{
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
         System.out.println("Programa de matriz 3x3 que mostra apenas os elementos da diagonal principal");
        int[][] matriz =new int[3][3];
        System.out.println("Digite os elementos da matriz 3x3:");


        for(int i=0; i<3; i++){
            for (int n = 0; n < 3; n++) {
                matriz[i][n] = scanner.nextInt();
}
 }

        System.out.println("Elementos da diagonal principal:");
        for (int i = 0; i < 3; i++) {
            System.out.println(matriz[i][i]);
        }

        scanner.close();
}
}