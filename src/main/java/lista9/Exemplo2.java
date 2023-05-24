package lista9;
import javax.swing.JOptionPane;

public class Exemplo2 {
    public static void main(String[] args){
        int a = 0, b = 0, c = 0, d = 0, r = 0;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do 1º número:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do 2º número:"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do 3º número:"));
        d = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do 4º número:"));

        r = (a*b) + (a*c) + (a*d);
        JOptionPane.showMessageDialog(null, "O resultado é: " +r);
    }
}
