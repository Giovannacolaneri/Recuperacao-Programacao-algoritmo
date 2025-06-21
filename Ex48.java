import java.util.Scanner;

public class Ex48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Programa que lê a nota do aluno e mostra a média");
        String sair = "";

        do{
            System.out.print("nome do aluno: ");
            String nome = scanner.nextLine();
            System.out.print("nota 1: ");
            double n1 = scanner.nextDouble();
            System.out.print("nota 2: ");
            double n2 = scanner.nextDouble();
            double media = (n1 + n2) / 2;
            System.out.println("aluno " + nome + " teve media: " + media);
            System.out.print("quer cadastrar outro? (s/n): ");
            scanner.nextLine();
            sair = scanner.nextLine();

        }while (!sair.equalsIgnoreCase("n"));

        System.out.println("fim dos cadastros");
        scanner.close();
    }
}
