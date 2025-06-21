import javax.swing.JOptionPane;

public class Ex37 {

     public static void main(String[] args) {
        double nota = 0;
        double soma = 0;
        int quantidade = 0;

        

        while (nota >= 0 && nota <= 10) {
            String texto = JOptionPane.showInputDialog("Digite uma nota entre 0 e 10 (ou outra para parar):");
            nota = Double.parseDouble(texto);

            if (nota >= 0 && nota <= 10) {
                soma += nota;
                quantidade++;
     }
        }

        if (quantidade > 0) {
            double media = soma / quantidade;
            JOptionPane.showMessageDialog(null, "Média das notas: " + media);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma nota válida foi digitada.");
     }
 }
}
