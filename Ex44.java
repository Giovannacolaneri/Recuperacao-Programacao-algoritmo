import java.util.Scanner;

public class Ex44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String todos = "";
        String nome = "";

        System.out.println("Programa que lê nomes até 'fim' ser digitado");

        do {
            System.out.print("nome: ");
             nome = scanner.nextLine();
            if (!nome.equalsIgnoreCase("fim")) {
                todos += nome + " ";
            }
        } while (!nome.equalsIgnoreCase("fim"));

        System.out.println("Nomes digitados:");
        System.out.print(todos);

        scanner.close();
    }
}
