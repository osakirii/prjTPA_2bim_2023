package lista11;
import javax.swing.JOptionPane;

public class ex1 {
    public static void main(String[] args){
        float hora;
        hora = Float.parseFloat(JOptionPane.showInputDialog("Digite o horário em horas:"));

        if(hora > 24 || hora < 0) 
             JOptionPane.showMessageDialog(null, "Horário inválido!");
        else if(hora >= 5 && hora < 13)
            JOptionPane.showMessageDialog(null, "Este horário está no turno da manhã.");
        else if(hora >= 13 && hora < 21)
            JOptionPane.showMessageDialog(null, "Este horário está no turno da tarde.");
        else
            JOptionPane.showMessageDialog(null, "Este horário está no turno da noite.");
    }
}