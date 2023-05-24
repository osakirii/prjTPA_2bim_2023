package lista10;
import javax.swing.JOptionPane;

public class ex4 {
    public static void main(String[] args){
        float kg;
        kg = Float.parseFloat(JOptionPane.showInputDialog("Digite a quantidade de quilos que o pescador possui:"));

        if(kg > 50){
            kg = (kg - 50)*4;
            JOptionPane.showMessageDialog(null, "A multa a ser paga por essa pessoa é de: R$" +kg +".");
        } else JOptionPane.showMessageDialog(null, "Está dentro da lei.");
    }
}