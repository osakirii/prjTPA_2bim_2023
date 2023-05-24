package lista9;
import javax.swing.JOptionPane;

public class Exemplo1 {
    public static void main(String[] args){
        String numero = JOptionPane.showInputDialog("Digite um número:");

        JOptionPane.showMessageDialog(null, "O número digitado foi: " +numero);
    }
}
