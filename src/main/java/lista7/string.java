package lista7;
public class string {
    public static void main(String[] args) {
        String str = "Isto é uma string do Java";
        String xyz = new String("Isto é uma string do Java");

        if(str == xyz)
            System.out.println("IGUAL");
        else
            System.out.println("DIFERENTE"); //maneira incorreta de comparar String, por isso vai dar DIFERENTE

        if(str.equals(xyz))
            System.out.println("Tamanho: "+ str.length());
            System.out.println("Substring: "+ str.substring(0, 10));
            System.out.println("Caracter na posição 5: "+ str.charAt(5)); //maneira correta

            String palavras[] = str.split(" "); //quebra a linha sempre que encontrar um espaço
            System.out.println("Palavras: "+ palavras[0]);
            System.out.println("Palavras: "+ palavras[1]);
            System.out.println("Palavras: "+ palavras[2]); 

            int i = str.indexOf("uma"); //aponta o index
            System.out.println("Índice: "+ i); //o index começa sempre a partir do 0

            boolean teste = (str.startsWith("Olá") || str.endsWith("Mundo")); //compara o início e o fim da string
            System.out.println("Resultado:" + teste);

            str = str.trim(); //elimina espaços vazios no início e no fim da string
            System.out.println(str);

            str = str.replace('a', '@'); //substitui caracteres
            System.out.println(str);
            str = str.replaceAll("string", "Cadeia de Caracteres");
            System.out.println(str);
    }
}
