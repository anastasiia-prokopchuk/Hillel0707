package Lessons.lesson13;

import Lessons.lesson13.enumExample.Car;
import Lessons.lesson13.enumExample.Country;

public class Lesson13 {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            System.out.println(i + " Я выполняюсь перед continue");
            if (i > 2) {
                continue;
            }
            System.out.println("       " + i + " : я выполнюсь всего два раза :(");
        }

        System.out.println(Car.BMW);

        for (Car c : Car.values()) {
            //System.out.println(c);

            // System.out.println(c.name());

            if (c.name().equals("BMW")) {
                System.out.println("BMW существует");
            }
        }


    }
}
