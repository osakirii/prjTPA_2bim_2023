package lista7;
public class variaveis {
    public static void main( String[] args) {
        int idade = 25; //declara um int e atribui um valor
            System.out.println("Idade: "+ idade);

        float valor;
        valor = 1.99f; //declara um float e, depois, atribui um valor
            System.out.println("Valor: "+ valor);

        boolean vOuF = false; //declara um boolean
            System.out.println("verdadeiroOuFalso 1: " + vOuF);
        vOuF = true; //muda o valor deste boolean
            System.out.println("verdadeiroOuFalso 2: " + vOuF);

        char letraA = 'A';
            System.out.println("Letra A: "+ letraA);
        letraA = 65; //A em ASCII
            System.out.println("Letra A ASCII: "+ letraA);
        letraA = '\u0041'; //A em Unicode
            System.out.println("Letra A Unicode: "+ letraA);

        byte b = 127; //declarando um byte
            System.out.println("Byte: "+ b);

        short s = 1024; //declarando um short
            System.out.println("Short: "+ s);

        long l = 1234567890; //declarando um long
            System.out.println("Long: "+ l);

        double d = 100.0; //declarando um double
            System.out.println("Double: "+ d);

        int var1 = 0, var2 = 1, var3 = 2, var4;
            System.out.println("Variável 1: " +var1 +". Variável 2: " +var2 +". Variável 3: " +var3);
    }
}