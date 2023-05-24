package lista10;
import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

public class ex2 {
    public static void main(String[] args){
        int n;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        if (n > 0)
            JOptionPane.showMessageDialog(null, "Este número é positivo.");
        else 
            JOptionPane.showMessageDialog(null, "Este número é negativo.");
    }
}