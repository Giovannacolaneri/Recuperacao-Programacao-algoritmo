import java.util.Scanner;

public class Ex15 {
      public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("******Simulador de caixa eletronico******");

        System.out.println("escolha as opcoes (1 para saque, 2 para deposito e 3 para saldo)");
         System.out.print("digite a opcao desejada:");
        int opcao = scanner.nextInt();
        int saldo=1400;

        switch(opcao){
            case 1: System.out.print("Digite o valor para saque: R$ ");
                    double saque = scanner.nextDouble();
                    if (saque>0 && saque<=saldo) {
                        saldo -= saque;
                        System.out.println("Saque realizado com sucesso!");
                    } else {
                        System.out.println("Saque inválido ou saldo insuficiente.");
                    }
                    break;
            case 2:
            System.out.print("Digite o valor para depósito: R$ ");
                    double deposito = scanner.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Depósito realizado com sucesso!");
                    } else {
                        System.out.println("Valor inválido.");
                    }
                    break;
            case 3:
             System.out.println("Seu saldo atual é: R$ " + saldo);
               break;

           
        }
scanner.close();

      }
}