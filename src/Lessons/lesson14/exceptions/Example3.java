package Lessons.lesson14.exceptions;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);

        int b = scanner.nextInt();
        int[] a = {3, 4, 6};

        try {
            System.out.println(a[b] / 0);
        } catch (IndexOutOfBoundsException | ArithmeticException i) {
            // catch(Exeption i)
            System.out.println("Что то пошло не так");
        }

        System.out.println("Программа продолжает работу");


    }
}
