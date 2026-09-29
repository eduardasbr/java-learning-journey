package operadoresaritmeticos;

public class OperadoresAritmeticos {

    public static void main(String[] args) {

        int n1 = 3;
        int n2 = 5;

        float m = (n1 + n2)/2;

        System.out.println("Media: " + m);

        //Incremento com ++
        int numero = 5;
        numero++;
        System.out.println("Incremento: " + numero);

        //Decremento com --
        int num = 5;
        num--;
        System.out.println("Decremento: " + num);


        // ------------- Operadores Unarios --------------

        //Pos Incremento
        int num1 = 5;
        int valor1 = 5 + num1++;
        System.out.println("Pos Incremento: " +valor1);

        //Pre Incremento
        int num2 = 5;
        int valor2 = 5 + ++num2;
        System.out.println("Pre incremento: " + valor2);

        // --------------- Operadores de Atribuicao -------------

        int x = 4;
        x += 2; // x = x + 2
        System.out.println("Com atribuicao(+=): " + x);

        // ---------------- Classe Math -------------------

        double raizquadrada = Math.sqrt(81);
        double potencia= Math.pow(2,4);

        System.out.println("Raiz Quadrada de 81: " + raizquadrada);
        System.out.println("2 elevado a 4 potencia: " + potencia);

        // ----------------- Arredondamento -------------------

        float v = 8.9f;
        int ar1 = (int) Math.floor(v);
        System.out.println("Arredondamento 'para baixo'(floor) de 8.9: " + ar1);

        float n = 8.9f;
        int ar2 = (int) Math.ceil(n);
        System.out.println("Arredondamento 'para cima'(ceil) de 8.9: " + ar2);

        float o = 8.9f;
        int ar3 = (int) Math.round(o);
        System.out.println("Arredondamento Aritmetico(round) de 8.9: " + ar3);

        // ----------------- Gerador de numeros --------------------

        double ale = Math.random();
        System.out.println("Valor aleatorio: " + ale);

        // Entre valores predefinidos (aleatorio entre 10 e 5)

        double ale2 = Math.random();
        int valor = (int) (5 + ale2 * (10-5));
        System.out.println("Valor aleatorio entre 10 e 5: " + valor);

    }
}
