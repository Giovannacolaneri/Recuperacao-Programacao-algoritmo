import java.util.Scanner;

public class Ex34 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa que le valores positivos e mostra a media deles");
        System.out.println("Digite um valor positivo: (negativo se quiser parar o programa) ");

        int contador=0;
        double valor = scanner.nextInt();
        double soma =0;
        
        while ( valor >0  ) {
            soma = soma + valor;
            contador++;
            System.out.println("Digite outro valor: ");
            valor = scanner.nextInt();

        }
        if (contador > 0) {
            double media = (double) soma / contador; 
        System.out.println(" a media de valores é "+ media);
        }else{
            System.out.println("Nenhum valor foi valido");

        }
        
scanner.close();    }}
