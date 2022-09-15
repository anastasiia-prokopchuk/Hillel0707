package Lessons.lesson6;

import java.util.Scanner;

public class Test2 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку в консоль");

        String input = scanner.nextLine();
        String[] splited = input.split(" ");

        System.out.println("Вы ввели " + splited.length + " слов");
    }
}
