package Lessons.lesson14.exceptions;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        writeSomething("bla bla bla");
    }


    public static void writeSomething(String str) {
        try {
            FileWriter fileWriter = new FileWriter("text.txt");
            FileWriter fileWriter2 = new FileWriter("text.txt");
            fileWriter.close();
            fileWriter.write(str);
            fileWriter2.close();
            System.out.println("Работа программы в рамках блока try/catch");
        } catch (IOException e) {
            System.out.println("Поток закрыт! Запись невозможна!");
            //e.printStackTrace();
        } finally {
            System.out.println("Учите теорию, пожалуйста");
        }
        System.out.println("Работа программы за блоком try/catch");
    }
}
