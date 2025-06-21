import java.util.Scanner;

public class Ex43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("--- menu ---");
            System.out.println("1 - dizer oi");
            System.out.println("2 - contar ate 5");
            System.out.println("3 - mostrar um numero aleatorio");
            System.out.println("0 - sair");
            System.out.print("digite: ");
            opcao = scanner.nextInt();

            if(opcao == 1){
                System.out.println("oi, tudo bem? :)");
            }else if(opcao == 2){
                for(int i=1;i<=5;i++){
                    System.out.print(i + " ");
                }
                System.out.println();
            }else if(opcao == 3){
                System.out.println("numero aleatorio: " + (int)(Math.random()*100));
            }else if(opcao != 0){
                System.out.println("opcao invalida");
            }

        } while(opcao != 0);

        System.out.println("saindo...");
        scanner.close();
    }
}
