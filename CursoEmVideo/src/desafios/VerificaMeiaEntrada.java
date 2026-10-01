package desafios;

import java.util.Scanner;

public class VerificaMeiaEntrada {

    public static void main(String[] args) {

        // === Desafio: Meia-entrada ===

        /*Peça para o usuário digitar a idade dele.
        Considere que a pessoa tem direito à meia-entrada se:
        - tiver até 12 anos, ou
                - tiver 60 anos ou mais
        O programa deve mostrar:
        Digite sua idade: 10
        Tem direito à meia-entrada? SIM

        ou:
        Digite sua idade: 25
        Tem direito à meia-entrada? NAO*/

        Scanner teclado = new Scanner(System.in);

        System.out.println("======= Verificador de Meia-entrada =======");
        System.out.print("Digite a sua idade: ");

        int age = teclado.nextInt();
        String verificacao;

        verificacao = (age<13 || age>=60)?"MEIA-ENTRADA":"INTEIRA";

        System.out.println("Direito: " + verificacao);

    }

}
