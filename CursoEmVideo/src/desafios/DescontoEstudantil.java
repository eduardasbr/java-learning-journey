package desafios;

import java.util.Scanner;

public class DescontoEstudantil {

    public static void main(String[] args) {

        /* === Desafio — Acesso ao desconto estudantil ===

            Peça para o usuário digitar:
            - a idade
            - se está matriculado em alguma instituição (1 = SIM, 0 = NÃO)

            A pessoa tem direito ao desconto se:
            - tiver até 25 anos
            - E estiver matriculada*/

        System.out.println("======= VERIFICADOR DE DESCONTO ESTUDANTIL =======");

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = teclado.nextInt();

        System.out.print("Esta matriculado(a)? (1 - SIM | 0 - NAO): ");
        int matricula = teclado.nextInt();

        String resultado;

        resultado = (idade<=25 && matricula==1)?"DESCONTO LIBERADO":"SEM DESCONTO";

        System.out.println("Resultado: " + resultado);

    }

}
