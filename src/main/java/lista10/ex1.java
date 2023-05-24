package lista10;
import javax.swing.JOptionPane;

public class ex1 {
    public static void main(String[] args){
        int sex;
        double alt;
        sex = Integer.parseInt(JOptionPane.showInputDialog("Digite 0 para mulher, 1 para homem:"));
        alt = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura em metros para o cálculo de peso ideal:"));

        if (sex == 0){
            alt = (62.1*alt) - 44.7;
        }
        else{
            alt = (72.7*alt) - 58;
        }
        JOptionPane.showMessageDialog(null, "O peso ideal para esta pessoa é: " +alt +"kg.");
    }
}