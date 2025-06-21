import java.util.Scanner;

public class Ex49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Programa de login: ");
        String loginCerto = "usuario";
        String senhaCerta = "1234";
        String login;
        String senha;
        int tentativas = 0;

        do{
            System.out.print("login: ");
            login = scanner.nextLine();
            System.out.print("senha: ");
            senha = scanner.nextLine();
            tentativas++;

            if(login.equals(loginCerto) && senha.equals(senhaCerta)){
                System.out.println("acesso liberado");
                break;
             }else{
                System.out.println("login ou senha errado");
         }

        } while(tentativas<3);

        if(!(login.equals(loginCerto) && senha.equals(senhaCerta))){
            System.out.println("3 tentativas falhadas, acesso bloqueado");
        }

        scanner.close();
    }
}
