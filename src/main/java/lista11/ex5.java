package lista11;
import javax.swing.JOptionPane;

public class ex5 {
    public static void main(String[] args){
        float n1, n2, n3, n4;
        n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota no 1º bimestre:"));
        n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota no 2º bimestre:"));
        n3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota no 3º bimestre:"));
        n4 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota no 4º bimestre:"));

        n1 = (n1+n2+n3+n4)/4;
        if(n1 >= 9 && n1 <= 10)
            JOptionPane.showMessageDialog(null, "Aprovado com média " +n1 +", nota A.");
        else if(n1 >= 7 && n1 < 9)
            JOptionPane.showMessageDialog(null, "Aprovado com média " +n1 +", nota B.");
        else if(n1 >= 5 && n1 < 7)
            JOptionPane.showMessageDialog(null, "Aprovado com média " +n1 +", nota C.");
        else if(n1 >= 2.5 && n1 < 5)
            JOptionPane.showMessageDialog(null, "Reprovado com média " +n1 +", nota D.");
        else if(n1 < 2.5)
            JOptionPane.showMessageDialog(null, "Reprovado com média " +n1 +", nota E.");
        else
            JOptionPane.showMessageDialog(null, "Média inválida.");
    }
}
