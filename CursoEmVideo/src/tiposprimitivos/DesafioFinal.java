package tiposprimitivos;

import java.util.Scanner;

public class DesafioFinal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = teclado.nextLine();

        System.out.print("Digite a sua idade: ");
        int idade = teclado.nextInt();

        System.out.print("Digite o seu salário: ");
        float salario = teclado.nextFloat();

        System.out.printf("Olá, %s! Você tem %d anos e tem um salário de R$ %.2f", nome, idade, salario);

    }
}
