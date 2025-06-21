import javax.swing.JOptionPane;

public class Ex3{
    public static void main(String[] args) {
        int[] vetor = new int[10];
      for (int i = 0; i < vetor.length; i++){
            String entrada = JOptionPane.showInputDialog("Digite o número " + (i + 1) + ":");
            int numero = Integer.parseInt(entrada);

            if (numero % 2 == 0) {
                vetor[i] = numero;
            }else{
                JOptionPane.showMessageDialog(null, "Numero impar, numero invalidado");
                vetor[i] = 0;
 }
 }

        String resultado = "Números digitados:\n";
        for (int i = 0; i < vetor.length; i++) {
            resultado += vetor[i] + " ";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}
