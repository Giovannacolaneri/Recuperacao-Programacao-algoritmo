import java.util.Scanner;

public class Ex38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        
        System.out.println("Programa que faz um contador regressivo do numero informado pelo usuario:");
        
        
            System.out.print("Digite o número: ");
            double n = scanner.nextDouble();
            System.out.println("Contagem regressiva de n: "+ n );

            while (n>0) {
                n=n-1;
                 System.out.println("Contagem regressiva de n: "+ n );

                
            }
          
        scanner.close();
               
}
}
        
    
