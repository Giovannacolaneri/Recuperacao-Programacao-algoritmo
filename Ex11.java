import javax.swing.JOptionPane;

public class Ex11{
    public static void main(String[] args) {

        
        JOptionPane.showMessageDialog(null, "Menu");
        JOptionPane.showMessageDialog(null, "opção 1 - mostra uma mensagem");
         JOptionPane.showMessageDialog(null, "opção 2-Calcula o dobro de um numero");
        JOptionPane.showMessageDialog(null, "opção 3- sair");

 String opcStr= JOptionPane.showInputDialog("Escolha uma opcao:");
        int opcao = Integer.parseInt(opcStr);

        switch (opcao) {
            case 1:
                JOptionPane.showMessageDialog(null, "Você escolheu a opção 1!");
                break;
            case 2:
                String numeroStr = JOptionPane.showInputDialog("Digite um número:");
                int numero = Integer.parseInt(numeroStr);
                int dobro = numero * 2;
                JOptionPane.showMessageDialog(null, "O dobro de " + numero + " é " + dobro);
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Saindo do programa. Até logo!");
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opção inválida.");
        }
    }
}
