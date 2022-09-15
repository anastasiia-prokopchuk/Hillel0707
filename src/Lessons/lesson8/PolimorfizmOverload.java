package Lessons.lesson8;

public class PolimorfizmOverload {
    public static void main(String[] args) {
        int a = 100;
        double b = 1.1;
        String c = "Alex";

        add();
        add(2, 4);
        add("fff", 4);
        add(1.2, 3.2);
        add(4, 5, 7);


    }

    public static void add() {
        System.out.println("Hello");
    }

    public static void add(int a, int b) {
        int c = a / b;
        System.out.println(c);
    }

    public static void add(int num, int num1, int num2) {
        int e = num + num1 + num2;
        System.out.println(e);
    }

    public static void add(double a, double b) {
        double c = a + b;
        System.out.println(c);
    }

    public static void add(String a, int b) {
        System.out.println(a + " " + b);
    }


}
