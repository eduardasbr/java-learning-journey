package tiposprimitivos;

import java.util.Scanner;

class ReinforcingLearning {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Type your name:  ");
        String name = keyboard.nextLine();

        System.out.print("Type your course: ");
        String course = keyboard.nextLine();

        System.out.print("Type your age: ");
        int age = keyboard.nextInt();

        System.out.print("Type your grade: ");
        float grade = keyboard.nextFloat();

        System.out.printf("%s, %d years old, is enrolled in the %s program and got a %.2f grade.", name, age, course, grade);
    }
}
