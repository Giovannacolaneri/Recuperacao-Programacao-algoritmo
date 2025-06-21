import javax.swing.JOptionPane;

public class Ex10{
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Programa que verifica se uma matriz é simétrica");
        int[][] matriz = new int[3][3];
        boolean simetrica = true;

        for (int i = 0; i < 3; i++) {
            for(int n=0; n< 3; n++){
                String entrada = JOptionPane.showInputDialog("Digite o valor da posição [" + i + "][" +n+ "]:");
                matriz[i][n]= Integer.parseInt(entrada);
 }
 }
        for (int i = 0; i < 3; i++) {
            for (int n= 0; n< 3; n++){
             if (matriz[i][n] != matriz[n][i]) {
                simetrica = false;
                break;
     }
     }
 }

        if (simetrica) {
            JOptionPane.showMessageDialog(null, "A matriz é simétrica.");
        } else {
            JOptionPane.showMessageDialog(null, "A matriz NÃO é simétrica.");
 }
 }
}
