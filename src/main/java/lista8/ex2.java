package lista8;




import java.util.Scanner;

public class ex2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double brl, usd, mar, lib;

        System.out.print("Informe o dinheiro: R$");
        brl = input.nextDouble();
        System.out.println("\n");

        usd = brl/1.80;
        System.out.print("O valor em dólares é: $" +usd +"\n");
        mar = brl/2;
        System.out.print("O valor em marcos alemães é: $" +mar +"\n");
        lib = brl/1.57;
        System.out.print("O valor em libras esterlinas é: $" +lib +"\n");

        input.close();
    }
}
