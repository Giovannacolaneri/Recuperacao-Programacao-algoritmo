import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Programa que mostra a tabuada do numero informado:");
        System.out.println("Tabuada:");
         System.out.print("Digite o número: ");
            double n = scanner.nextDouble();

        
        for (int i = 1; i <= 10; i++) {
    
            double multiplicacao = n*i;
            System.out.println(n+" x "+ i +" = "+ multiplicacao);

            
        }
        
        System.out.println();
        scanner.close();
    }
}