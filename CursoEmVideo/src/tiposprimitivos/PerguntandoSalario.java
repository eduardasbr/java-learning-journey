package tiposprimitivos;

import java.util.Scanner;

public class PerguntandoSalario {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = teclado.nextLine();

        System.out.print("Digite o seu salário: ");
        float salario = teclado.nextFloat();

        System.out.printf("Olá, %s! Seu salário é de: R$ %.2f", nome, salario);


    }

}
