import java.util.Scanner;

public class Ex50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        int opc = 0;

        do{
            System.out.println("--- menu bancario ---");
            System.out.println("1 - ver saldo");
            System.out.println("2 - depositar");
            System.out.println("3 - sacar");
            System.out.println("4 - sair");
            System.out.print("escolha: ");
            opc = scanner.nextInt();

            switch(opc){
                case 1:
                    System.out.println("saldo atual: R$ " + saldo);
                 break;
                case 2:
                    System.out.print("valor pra depositar: R$ ");
                    double dep = scanner.nextDouble();
                    if(dep > 0){
                        saldo += dep;
                        System.out.println("depositado com sucesso");
                    } else {
                        System.out.println("valor invalido");
                    }
                 break;
                case 3:
                    System.out.print("valor pra sacar: R$ ");
                    double saque = scanner.nextDouble();
                    if(saque <= saldo && saque > 0){
                        saldo -= saque;
                        System.out.println("saque feito");
                    } else {
                        System.out.println("nao rola esse saque");
                    }
                break;
                case 4:
                    System.out.println("valeu por usar o banco");
                 break;
                default:
                    System.out.println("opcao errada");
            }

        }while(opc != 4);

        scanner.close();
    }
}
