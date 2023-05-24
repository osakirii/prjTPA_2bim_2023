package lista11;
import javax.swing.JOptionPane;

public class ex8 {
    public static void main(String[] args){
        float a, b, c;
        a = Float.parseFloat(JOptionPane.showInputDialog("Digite o lado A:"));
        b = Float.parseFloat(JOptionPane.showInputDialog("Digite o lado B:"));
        c = Float.parseFloat(JOptionPane.showInputDialog("Digite o lado C:"));

        if((a + b) > c && (a + c) > b && (b + c) > a){
            if(a == b || a == c || b == c){
                if(a == b && a == c && b == c)
                    JOptionPane.showMessageDialog(null, "O triângulo é equilátero (e, portanto, também é isósceles).");
                else
                    JOptionPane.showMessageDialog(null, "O triângulo é isósceles.");
            } else
                JOptionPane.showMessageDialog(null, "O triângulo é escaleno.");
        } else 
            JOptionPane.showMessageDialog(null, "O triângulo não existe.");
    }
}