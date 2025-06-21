import javax.swing.JOptionPane;

public class Ex5 {
    public static void main(String[] args) {
        double[] notas = new double[10];
        double soma = 0;
        int i = 0;
        while (i < 10) {
            String entrada = JOptionPane.showInputDialog("Digite a nota do aluno " +(i + 1)+ " (0 a 10):");
            double nota = Double.parseDouble(entrada);

            if (nota <= 10) {
                notas[i] = nota;
                soma += nota;
                i++; 
           }else{
                JOptionPane.showMessageDialog(null, "Nota inválida! Digite uma nota até 10.");
}
}

        double media = soma/10;
        JOptionPane.showMessageDialog(null, "A média das notas é: "+ media);
    }
}
