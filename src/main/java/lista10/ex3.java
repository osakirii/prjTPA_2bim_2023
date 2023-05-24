package lista10;
import javax.swing.JOptionPane;

public class ex3 {
    public static void main(String[] args){
        float n1, n2;
        n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o 1º número:"));
        n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o 2º número:"));

        n1 = n1 + n2;
        if(n1 > 25){
            JOptionPane.showMessageDialog(null, "A soma é maior que 25.");
        }
    }
}
