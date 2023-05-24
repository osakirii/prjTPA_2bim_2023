package lista11;
import javax.swing.JOptionPane;

public class ex3 {
    public static void main(String[] args){
        int lan=0;
        lan = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 a 5 para escolher: \n\n 1: BigMac; \n 2: Quarteirão; \n 3: MacChicken; \n 4: Cheddar MacMelt; \n 5: MacMax."));

        switch(lan){
            case 1:
                JOptionPane.showMessageDialog(null, "Lanche: BigMac.");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Lanche: Quarteirão.");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Lanche: MacChicken.");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Lanche: Cheddar MacMelt.");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Lanche: MacMax.");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Lanche Inválido.");
                break;
        }
    }
}
