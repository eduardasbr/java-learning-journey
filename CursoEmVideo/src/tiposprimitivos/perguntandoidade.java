package tiposprimitivos;

import java.util.Scanner;

class PerguntandoIdade {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = teclado.nextInt();

        System.out.printf("Olá, %s! Você tem %d anos!", nome, idade);

    }

}
