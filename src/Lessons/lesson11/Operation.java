package Lessons.lesson11;

public class Operation {
    public static void main(String[] args) {
        int mouse = 5;
        int weight = 45;

        if (mouse != 0 & weight < 100) {
            System.out.println("Можно кормит кота");
        } else {
            System.out.println("Error");
        }

        if (mouse == 7 | weight < 100) {
            System.out.println("Можно корить кота");
        } else {
            System.out.println("Error");
        }

        int a = 10;
        if (++a == 10 && ++a == 12) {
            ++a;
        }
        System.out.println(a);

    }
}
