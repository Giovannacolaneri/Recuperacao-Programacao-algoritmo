import java.util.Scanner;

public class Ex33{
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("****Programa de senha****");
        String senha = "";
        while(!senha.equals("1234")){
        System.out.println("Digite Senha:");
        senha = scanner.nextLine();
    }
    System.out.println("Senha correta");
scanner.close();
}
}