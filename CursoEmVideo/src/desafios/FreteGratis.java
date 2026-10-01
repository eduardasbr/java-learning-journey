package desafios;

import java.util.Scanner;

public class FreteGratis {

    public static void main(String[] args) {

        /* === Desafio — Frete grátis ===

        Peça para o usuário digitar o valor da compra.
        A loja oferece frete grátis quando:
        - a compra é de R$ 150 ou mais, ou
        - o cliente tem um cupom especial.

        */

        System.out.println("======= Verificacao de Frete Gratis =======");

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        float compra = teclado.nextFloat();

        System.out.print("Possui cupom especial (1 - SIM | 0 - NAO): ");
        int cupom = teclado.nextInt();

        String resultado;

        resultado = (compra>=150 || cupom==1)?"GRATIS":"PAGO";

        System.out.println("Frete: " + resultado);

    }
}
