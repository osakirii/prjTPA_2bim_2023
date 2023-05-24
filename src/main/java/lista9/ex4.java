package lista9;
import javax.swing.JOptionPane;

public class ex4 {
    public static void main(String[] args){
        float val1, qua1, val2, qua2, IPI;
        String cod1, cod2;

        IPI = Float.parseFloat(JOptionPane.showInputDialog("Digite a porcentagem do IPI, de 0 a 100:"));

        cod1 = JOptionPane.showInputDialog("Digite o código da peça 1:");
        val1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor unitário da peça " +cod1 +":"));
        qua1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade de peças da peça " +cod1 +":"));

        cod2 = JOptionPane.showInputDialog("Digite o código da peça 2:");
        val2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor unitário da peça " +cod2 +":"));
        qua2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade de peças da peça " +cod2 +":"));

        IPI = (val1*qua1 + val2*qua2) *(IPI/100 + 1);
        JOptionPane.showMessageDialog(null, "O valor a ser pago é " +IPI +".");
    }
}
