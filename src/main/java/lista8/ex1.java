package lista8;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double A, bM, bm, h;
        
        System.out.println("Digite a base maior do trapézio:");
        bM = input.nextDouble();
        System.out.println("Digite a base menor do trapézio:");
        bm = input.nextDouble();
        System.out.println("Digite a altura do trapézio:");
        h = input.nextDouble();

        A = ((bM + bm)*h)/2;
        System.out.println("A área do trapézio é " +A);
    }
}
