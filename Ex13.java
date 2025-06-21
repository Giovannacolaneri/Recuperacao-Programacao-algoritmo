import javax.swing.JOptionPane;

public class Ex13{
   public static void main(String[] args){

JOptionPane.showMessageDialog(null, "Programa que lê uma letra e diz se ela é consoante ou vogal:");
String letra = JOptionPane.showInputDialog(null,"Digite a letra:");
String letraM = letra.toUpperCase();

switch(letraM){
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
             JOptionPane.showMessageDialog(null, "vogal");
            break;
            default:
             JOptionPane.showMessageDialog(null, "consoante");
            break;

              
}
} }