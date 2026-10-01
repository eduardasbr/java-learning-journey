package desafios;

import java.util.Scanner;

public class EntradaEvento {

    public static void main(String[] args) {

        /* === Desafio — Entrada liberada no evento ===

            Peça para o usuário digitar:
            - a idade
            - se possui convite (1 = SIM, 0 = NÃO)

            A entrada é LIBERADA se:
            - tiver 18 anos ou mais
            - E possuir convite
        */

        System.out.println("======= Seguranca entrada =======");

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = teclado.nextInt();

        System.out.print("Possui convite? (1 - SIM | 0 - NAO): ");
        int convite = teclado.nextInt();

        String resultado;

        resultado = (idade>=18 && convite==1)?"ENTRADA LIBERADA":"ENTRADA NEGADA";

        System.out.println("Resultado: " + resultado);

    }

}
