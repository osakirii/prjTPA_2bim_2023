package lista11;
import javax.swing.JOptionPane;

public class ex6 {
    public static void main(String[] args){
        int ida;
        ida = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do nadador:"));

        if(ida < 5)
            JOptionPane.showMessageDialog(null, "Idade inválida.");
        else if(ida >= 5 && ida <= 7)
            JOptionPane.showMessageDialog(null, "Categoria: Infantil A.");
        else if(ida >= 8 && ida <= 10)
            JOptionPane.showMessageDialog(null, "Categoria: Infantil B.");
        else if(ida >= 11 && ida <= 13)
            JOptionPane.showMessageDialog(null, "Categoria: Juvenil A.");
        else if(ida >= 14 && ida <= 17)
            JOptionPane.showMessageDialog(null, "Categoria: Juvenil B.");
        else 
            JOptionPane.showMessageDialog(null, "Categoria: Senior.");
    }
}
