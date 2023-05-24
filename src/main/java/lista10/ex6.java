package lista10;
import javax.swing.JOptionPane;

public class ex6 {
    public static void main(String[] args){
        int id;
        id = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));

        if(id >= 18)
            JOptionPane.showMessageDialog(null, "A idade é " +id +", o que significa que esta pessoa já atingiu a maioridade.");
        else 
            JOptionPane.showMessageDialog(null, "A idade é " +id +", o que significa que esta pessoa ainda é menor.");
    }
}