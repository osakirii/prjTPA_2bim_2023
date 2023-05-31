package lista8;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //declara o scanner input
        double sal, vend; //declara variável do salário e valor de vendas
        String nome; //declara variável do nome
        
        System.out.print("Informe o primeiro nome do funcionário: ");
        nome = input.next(); //guarda o nome (apenas)
        System.out.print("Informe o salário fixo de " +nome +": R$");
        sal = input.nextDouble(); //guarda o salário
        System.out.print("Informe o valor das vendas de " +nome +": R$");
        vend = input.nextDouble(); //guarda o valor de vendas

        vend = vend*0.04; //aplica a comissão
        sal = sal+vend; //cria o novo salário
        System.out.println("O funcionário " +nome +" receberá RS$" +vend +" de comissão, e seu salário novo será R$" +sal);
        
        input.close();
    }
}
