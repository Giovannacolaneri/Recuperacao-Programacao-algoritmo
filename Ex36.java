import javax.swing.JOptionPane;

public class Ex36 {
    public static void main(String[] args) {
        int opcao = -1;

        while (opcao != 0) {
            String texto = JOptionPane.showInputDialog(
                "MENU" +
                " 1- Dizer Olá|"+ " 2- Mostrar horário|"+ " 3- Mensagem motivacional|"+ " 0- Sair|"+"Digite uma opção:");


            if (texto == null) {
                break;
            }
            opcao = Integer.parseInt(texto);

            if(opcao == 1) {
                JOptionPane.showMessageDialog(null, "Olá, td bem?");

            }else if (opcao ==2) {
                JOptionPane.showMessageDialog(null, "Horário fictício: 12:00");


            }else if (opcao ==3) {
                JOptionPane.showMessageDialog(null, "Você consegue! Continue tentando!");

            }else if (opcao ==0) {
                JOptionPane.showMessageDialog(null, "Saindo.");



            }else {
                JOptionPane.showMessageDialog(null, "opcao invalida");
 } } }
}
