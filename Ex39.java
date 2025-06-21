import javax.swing.JOptionPane;

public class Ex39 {
    public static void main(String[] args) {
        String login = "";
        String senha = "";


        while (!login.equals("admin") || !senha.equals("1234")) {
            login = JOptionPane.showInputDialog("Digite o login:");
            senha = JOptionPane.showInputDialog("Digite a senha:");
            if (!login.equals("admin") || !senha.equals("1234")) {
                JOptionPane.showMessageDialog(null, " Tente novamente.");
 }
 }

        JOptionPane.showMessageDialog(null, "Login realizado!");
  }
}
