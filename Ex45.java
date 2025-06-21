import java.util.Scanner;

public class Ex45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        String resp = "";

        System.out.println("Simulador de compras:");

        do {
            System.out.print("valor do item: R$ ");
             double preco = scanner.nextDouble();
             total += preco;

            System.out.print("quer adicionar mais coisas? (s/n): ");
            scanner.nextLine(); 
            resp = scanner.nextLine();

        } while(resp.equalsIgnoreCase("s"));

        System.out.println("valor total : R$ " + total);

        scanner.close();
    }
}
