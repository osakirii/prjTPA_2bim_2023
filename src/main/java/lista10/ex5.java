package lista10;
import javax.swing.JOptionPane;

public class ex5 {
    public static void main(String[] args){
        int pw;
        pw = Integer.parseInt(JOptionPane.showInputDialog("Digite a senha (apenas números):"));

        if(pw == 123) 
            JOptionPane.showMessageDialog(null, "Senha válida.");
        else
            JOptionPane.showMessageDialog(null, "Senha inválida.");
    }
}
