package lista8;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double hDegrau, hSobe;

        System.out.print("Informe, em metros, a altura de cada degrau: ");
        hDegrau = input.nextDouble();
        System.out.print("Informe, em metros, a altura que deseja chegar: ");
        hSobe = input.nextDouble();

        hDegrau = hSobe/hDegrau;
        System.out.println("O número de degraus que precisará subir é: " +hDegrau);
    }
}
