import java.util.Scanner;

public class Ex35 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa que le idade e calcula a média");
        System.out.println("Digite idade: (digite -1 se quiser parar a leitura): ");

        int contador = 0;
        int idade = scanner.nextInt();
        int soma = 0;
        
        while ( idade != -1  ) {
            soma += idade;
            contador++;
            System.out.println("Digite outra idade ou -1 para sair: ");
            idade = scanner.nextInt();

        }
        if (contador > 0) {
            double media = (double) soma / contador; 
        System.out.println(" a media de idades é "+ media);
        }else{
            System.out.println("Nenhuma idade válida foi digitada");

        }
            
        
    scanner.close();    }}
