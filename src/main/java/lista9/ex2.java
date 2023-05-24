package lista9;
import javax.swing.JOptionPane;

public class ex2 {
    public static void main(String[] args){
        float med1, med2, msum, mmed;
        med1 = (8 + 9 + 7)/3;
        med2 = (4 + 5 + 6)/3;

        msum = med1+med2;
        mmed = msum/2;

        JOptionPane.showMessageDialog(null, "A soma das médias é " +msum +", e a média das médias é " +mmed +".");
    }
}
