package tiposprimitivos;

import java.util.Scanner;

class PerguntandoCurso {

    public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    System.out.print("Digite o seu nome: ");
    String nome = teclado.nextLine();

    System.out.print("Digite o nome do seu curso: ");
    String curso = teclado.nextLine();

    System.out.printf("Olá, %s! Você está matriculado(a) no curso de: %s", nome, curso);

    }
}
