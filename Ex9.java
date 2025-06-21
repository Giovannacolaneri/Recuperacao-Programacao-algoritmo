import java.util.Scanner;

public class Ex9{
    public static void main(String[] args) {
        System.out.println("Programa de matriz 5x5 e identifica o maior valor da linha e coluna");

        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int maior = 0;
        int linha = 0;
        int coluna = 0;
        System.out.println("Digite os números da matriz 5x5:");
        for (int i=0; i<5; i++) {
            for (int n=0; n<5; n++) {
                System.out.print("Digite o valor da posição [" +i+"][" +n+ "]: ");
                matriz[i][n] = scanner.nextInt();

                if (i == 0 && n == 0) {
                    maior=matriz[i][n];
                } else if (matriz[i][n]>maior) {
                    maior = matriz[i][n];
                    linha=i;
                    coluna=n;
                }
            }
        }

        // Mostrando o maior valor e sua posição
        System.out.println("Maior valor: " + maior);
        System.out.println("Encontrado na linha " + linha + " e coluna " + coluna);

        scanner.close();
    }
}
