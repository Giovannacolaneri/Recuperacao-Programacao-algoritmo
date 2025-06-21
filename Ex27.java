import java.util.Scanner;

public class Ex27{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa que lê 5 nomes e 5 notas e tira a média de cada aluno");
        String[] nomes = new String[5];
         double[] notas1 = new double[5];
         double[] notas2 = new double[5];
  
        for (int i= 0; i <5; i++) {
            System.out.print("Digite o nome do aluno " + (i+ 1) + ": ");
               nomes[i] = scanner.nextLine();

             System.out.print("Digite a primeira nota de " +nomes[i] + ": ");
               notas1[i] = scanner.nextDouble();

            System.out.print("Digite a segunda nota de "+nomes[i] + ": ");
          
               notas2[i] = scanner.nextDouble();
            scanner.nextLine();
        }

        System.out.println("MÉDIA DOS ALUNOS:");
        for (int i = 0; i < 5; i++) {
            double media = (notas1[i] + notas2[i]) / 2;
            System.out.println(nomes[i] + " -Média:"+media);
 }

        scanner.close(); }
}
