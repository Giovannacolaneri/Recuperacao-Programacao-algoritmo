import java.util.Scanner;

public class Ex24{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.print("Programa que lê 10 nomes e mostra os nomes");
        String[] nomes = new String[10];


        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o " + (i + 1) + " nome: ");
            nomes[i] = scanner.nextLine();
     }



        System.out.println("Nomes digitados:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
}

        scanner.close();
 }
}
