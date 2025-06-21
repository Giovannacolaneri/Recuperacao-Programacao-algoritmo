import java.util.Scanner;

public class Ex46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secreto = (int)(Math.random() * 10) + 1;
        int chute = 0;

        System.out.println("Programa De jogo interativo que o usuario tenta adivinhar o numero de 1 a 10");

        while(chute!= secreto){
            System.out.print("Qual numero você acha que é?: ");
            chute = scanner.nextInt();

            if(chute==secreto){
                System.out.println("acertou!!! parabens");
            }else{
                System.out.println("errou, tente novamente...");
      }
        }
        scanner.close();
  }
}
