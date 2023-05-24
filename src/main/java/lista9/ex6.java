package lista9;
import javax.swing.JOptionPane;

public class ex6 {
    public static void main(String[] args){
        int n, ant, suc;

        n = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do número:"));
        ant = n-1;
        suc = n+1;

        JOptionPane.showMessageDialog(null, "O antecessor deste número é " +ant +", e o sucessor é " +suc +".");
    }
}
