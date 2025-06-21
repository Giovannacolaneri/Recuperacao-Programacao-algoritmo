import java.util.Scanner;

public class Ex40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opc = 0;

        while(opc != 5){
            System.out.println("calculadora ");
            System.out.println("1 - somar");
            System.out.println("2 - subtrair");
            System.out.println("3 - multiplicar");
            System.out.println("4 - dividir");
            System.out.println("5 - sair");
            System.out.print("escolhe uma opcao: ");
            opc = scanner.nextInt();

            if(opc >=1 && opc <=4){
                System.out.print("num 1: ");
                double a = scanner.nextDouble();
                System.out.print("num 2: ");
                double b = scanner.nextDouble();

            switch(opc){
                    case 1:
                        System.out.println("soma deu: " + (a + b));
                        break;
                    case 2:
                        System.out.println("sub deu: " + (a - b));
                }scanner.close();}}}}