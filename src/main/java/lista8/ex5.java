package lista8;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double prod, conv;

        System.out.print("Informe o custo do espetáculo: ");
        prod = input.nextDouble();
        System.out.print("Informe o preço dos convites: ");
        conv = input.nextDouble();

        conv = prod/conv;
        System.out.println("O número de convites mínimos que precisam ser vendidos é " +conv);

        input.close();
    }
}
