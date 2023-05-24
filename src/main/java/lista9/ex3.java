package lista9;
import javax.swing.JOptionPane;

public class ex3 {
    public static void main(String[] args){
        float bal;
        bal = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do saldo:"));

        bal = bal +(bal/100);
        JOptionPane.showMessageDialog(null, "Seu saldo com reajuste é de " +bal +".");
    }
}
