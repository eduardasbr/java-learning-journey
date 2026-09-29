package operadoresaritmeticos;

public class Comparando {

    static void main() {

        String nome1 = "Eduarda";
        String nome2 = "Eduarda";
        String nome3 = new String("Gustavo");
        String res;
        res = (nome1.equals(nome3))?"Igual":"Diferente";
        System.out.println("O conteúdo é igual ou diferente (usando .equals): " + res);

    }

}
