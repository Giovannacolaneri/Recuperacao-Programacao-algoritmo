public class Ex23 {

    public static void main(String[] args) {
        System.out.println("Programa que mostra os numeros pares entre 1 e 50");
        int contador=0;
        for(int i=1; i<=50 ; i++){
            if ( i % 2 == 0) {
                System.out.println(i);
                contador++;
            }
        }
         System.out.println("A quantidade de numeros pares entre 1 e 50 é "+ contador);
}
}