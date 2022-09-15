package Lessons.lesson14.exceptions.myExeption;

public class MyExeptionDemo {
    public static void main(String[] args) {
        try {

            compute(9);
            compute(11);
        } catch (MyExeption e) {
            System.err.println("Перехоплене виключення " + e);
        }
        System.out.println("Подальший хід виконання main");
    }

    public static void compute(int a) throws MyExeption {
        System.out.println("Викликано метод compute з цифрою " + a);
        if (a > 10) {
            throw new MyExeption(a, "trouble here");
        }
        System.out.println("Нормальне завершення програми");
    }
}
