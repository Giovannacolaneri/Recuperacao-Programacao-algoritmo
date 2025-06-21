import java.util.Scanner;

public class Ex47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
          System.out.print("Programa de login ");
          String senhaCerta = "1234";
        String tentativa = "";
        int tentativas = 0;

        do{
            System.out.print("digite a senha: ");
          tentativa = scanner.nextLine();
            tentativas++;

            if(tentativa.equals(senhaCerta)){
                System.out.println("senha correta, seja bem vindo!");
                break;
            }else{
                System.out.println("senha incorreta");
 }

        } while(tentativas < 3);

        if(!tentativa.equals(senhaCerta)){
            System.out.println("passou das tentativas, bloqueado");
}
    scanner.close();
    }
}
