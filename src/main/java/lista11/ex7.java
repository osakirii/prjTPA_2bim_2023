package lista11;
import javax.swing.JOptionPane;

public class ex7 {
    public static void main(String[] args){
        int d1, m1, a1, d2, m2, a2;
        
        d1 = Integer.parseInt(JOptionPane.showInputDialog("Digite Dia 1:"));
        m1 = Integer.parseInt(JOptionPane.showInputDialog("Digite Mês 1:"));
        a1 = Integer.parseInt(JOptionPane.showInputDialog("Digite Ano 1:"));

        d2 = Integer.parseInt(JOptionPane.showInputDialog("Digite Dia 2:"));
        m2 = Integer.parseInt(JOptionPane.showInputDialog("Digite Mês 2:"));
        a2 = Integer.parseInt(JOptionPane.showInputDialog("Digite Ano 2:"));

        if(a2 <= a1){
            if(m2 <= m1){
                if(d2 < d1)
                    JOptionPane.showMessageDialog(null, "A ordem crescente é: " +d2 +"/" +m2 +"/" +a2 +", depois " +d1 +"/" +m1 +"/" +a1 +".");
                else if(d2 > d1)
                    JOptionPane.showMessageDialog(null, "A ordem crescente é: " +d1 +"/" +m1 +"/" +a1 +", depois " +d2 +"/" +m2 +"/" +a2 +".");
            } else if(m2 > m1)
                JOptionPane.showMessageDialog(null, "A ordem crescente é: " +d1 +"/" +m1 +"/" +a1 +", depois " +d2 +"/" +m2 +"/" +a2 +".");
        } else
            JOptionPane.showMessageDialog(null, "A ordem crescente é: " +d1 +"/" +m1 +"/" +a1 +", depois " +d2 +"/" +m2 +"/" +a2 +".");
    }
}
