package lista9;
import javax.swing.JOptionPane;

public class ex5 {
    public static void main(String[] args){
        float sMin, vSal;

        sMin = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor de um salário mínimo:"));
        vSal = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do salário do usuário:"));

        vSal = vSal/sMin;
        JOptionPane.showMessageDialog(null, "O usuário recebe " +vSal +" salários mínimos.");
    }
}
