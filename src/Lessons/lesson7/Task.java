package Lessons.lesson7;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        consoleOutput(); //vvedite stroku
        String textFromScanner = getInputString(); //priem stroki
        String[] arrAfterSplit = arrayFromStr(textFromScanner); //stroku v massiv
        String[] arrAfterRevers = reverseArray(arrAfterSplit); //zmina porzdku
        printArray(arrAfterRevers); //vivod v konsol


    }

    public static void consoleOutput() {
        System.out.println("Введите какой то текст");
    }

    public static String getInputString() {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        return text;
    }

    private static String[] arrayFromStr(String str) {
        String[] arrAfterSplit = str.trim().split(" ");
        return arrAfterSplit;
    }


    private static String[] reverseArray(String[] arrText) {
        String[] reversArr = arrText;
        String temp = null;
        int count = arrText.length;
        for (int i = 0; i < count / 2; i++) {
            temp = reversArr[count - i - 1];
            reversArr[count - i - 1] = reversArr[i];
            reversArr[i] = temp;
        }
        return reversArr;
    }


    private static void printArray(String[] arr) {
        for (String array : arr) {
            System.out.println(array);
        }
    }


}
