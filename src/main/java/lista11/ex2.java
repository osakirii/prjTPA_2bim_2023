package lista11;
import javax.swing.JOptionPane;

public class ex2 {
    public static void main(String[] args){
        float alt, kg;
        alt = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura em metros:"));
        kg = Float.parseFloat(JOptionPane.showInputDialog("Digite a massa em quilos:"));

        kg = kg/(alt*alt);
        if(kg < 18)
            JOptionPane.showMessageDialog(null, "IMC: Magreza.");
        else if(kg >= 18 && kg < 25)
            JOptionPane.showMessageDialog(null, "IMC: Saudável.");
        else if(kg >= 25 && kg < 30)
            JOptionPane.showMessageDialog(null, "IMC: Sobrepeso.");
        else
            JOptionPane.showMessageDialog(null, "IMC: Obesidade.");
    }
}
