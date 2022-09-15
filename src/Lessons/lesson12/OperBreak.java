package Lessons.lesson12;

public class OperBreak {

    public static void main(String[] args) {

        int i = 1;
        int a = 3;
        while (i <= 5) {
            System.out.println(i + "Цикл выполняется");
            if (i == a) {
                break;
            }
            i++;
        }

        for (int j = 1; j <= 3; j++) {
            System.out.println("Это первый цикл! Я выполняюсь " + j + " раз");
            for (int u = 1; u <= 10; u++) {
                System.out.println("Это второй цикл! Я выполняюсь " + u + " раз");
                if (u == 2) {
                    break;
                }
            }
        }


        int number = 2;
        switch (number) {
            case 1:
                System.out.println("Число 1");
                break;
            case 2:
                System.out.println("Число 2");
                break;
            case 3:
                System.out.println("Число 3");
                break;
        }

    }


}
