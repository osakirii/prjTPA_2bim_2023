package lista11;
import javax.swing.JOptionPane;

public class ex4 {
    public static void main(String[] args){
        int mes=0;
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do mês:"));

        switch(mes){
            case 1:
                JOptionPane.showMessageDialog(null, "Mês: Janeiro.");
                break;
            case 2:
            JOptionPane.showMessageDialog(null, "Mês: Fevereiro.");
                break;
            case 3:
            JOptionPane.showMessageDialog(null, "Mês: Março.");
                break;
            case 4:
            JOptionPane.showMessageDialog(null, "Mês: Abril.");
                break;
            case 5:
            JOptionPane.showMessageDialog(null, "Mês: Maio.");
                break;
            case 6:
            JOptionPane.showMessageDialog(null, "Mês: Junho.");
                break;
            case 7:
            JOptionPane.showMessageDialog(null, "Mês: Julho.");
                break;
            case 8:
            JOptionPane.showMessageDialog(null, "Mês: Agosto.");
                break;
            case 9:
            JOptionPane.showMessageDialog(null, "Mês: Setembro.");
                break;
            case 10:
            JOptionPane.showMessageDialog(null, "Mês: Outubro.");
                break;
            case 11:
            JOptionPane.showMessageDialog(null, "Mês: Novembro.");
                break;
            case 12:
            JOptionPane.showMessageDialog(null, "Mês: Dezembro.");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Mês Inválido.");
                break;
        }
    }
}
