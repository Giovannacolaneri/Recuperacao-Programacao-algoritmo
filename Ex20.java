import java.util.Scanner;

public class Ex20{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] votos = new int[3]; 
         System.out.println("Programa de sistema de votacao");
        System.out.println(" CANDIDATOS ");
        System.out.println("1 - Maria");
        System.out.println("2 - João");
        System.out.println("3 - Ana");


        for (int i= 1; i<= 3; i++) {
            System.out.print("Digite o número do seu voto (" + i + " voto): ");
            int voto = scanner.nextInt();

            switch (voto){
                case 1:
                    votos[0]++; 
                    break;
                case 2:
                    votos[1]++; 
                    break;
                case 3:
                    votos[2]++;
                    break;
                default:
                    System.out.println("Voto inválido!");
            }
        }

        System.out.println(" RESULTADO FINAL");
        System.out.println("Maria: " + votos[0] + " votos");
        System.out.println("João : " + votos[1] + " votos");
        System.out.println("Ana  : " + votos[2] + " votos");

        scanner.close();
    }
}
