package lista9;
import javax.swing.JOptionPane;

public class ex1 {
    public static void main(String[] args){
        int y, m, d;
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade em anos:"));
        m = Integer.parseInt(JOptionPane.showInputDialog("Digite quantos meses a mais de idade você tem:"));
        d = Integer.parseInt(JOptionPane.showInputDialog("Digite, além dos meses, quantos dias a mais de idade você tem:"));

        d = d + (m*30) + (y*365);
        JOptionPane.showMessageDialog(null, "Você tem " +d +" dias de idade.");
    }
}
