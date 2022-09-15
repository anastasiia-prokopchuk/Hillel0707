package Lessons.lesson3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int result;

        Scanner scanner = new Scanner(System.in);
        System.out.println("??????? ???: ");
        String name = scanner.next();

        result = number1 + number2;

        System.out.println(name + " " + result);
    }

}
