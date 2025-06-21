import javax.swing.JOptionPane;

public class Ex{

    
}
    public static void main(String[] args) {
        int opcao1= -1;

        while (opcao != 0) {
            String opcao= JOptionPane.showInputDialog(
                "Calculadora|"+"1 - Soma"+ "|2- Subtração" +"|3- Multiplicação" + "|4- Divisão" + "|0- Sair" + "Escolha uma opção:" );

            opcao= Integer.parseInt(opcao1);

            if (opcao > 0 && opcao <= 4) {
                double n1 = Double.parseDouble(JOptionPane.showInputDialog("Primeiro número:"));
                double n2 = Double.parseDouble(JOptionPane.showInputDialog("Segundo número:"));
                double resultado = 0;

                switch (opcao) {
                    case 1:
                        resultado = n1 + n2;
                        break;
                    case 2:
                        resultado = n1 - n2;
                        break;
                    case 3:
                        resultado = n1 * n2;
                        break;
                    case 4:
                        if (n2 == 0) {
                            JOptionPane.showMessageDialog(null, "Não divide por zero.");
                            continue;
                        } else {
                            resultado = n1 / n2;
                        }
                        break;
                }

                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
            } else if (opcao == 0) {
                JOptionPane.showMessageDialog(null, "Tchau!");
            } else {
                JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }
    }
}
