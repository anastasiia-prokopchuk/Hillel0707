package Homeworks;

public class Test11 {
    public static void main(String[] args) {
        for (int i = 1; i < 4; i++) {
            System.out.println("Это " + i + "-й урок!");
            if (i != 3) {
                System.out.println("Я выполнил все домашние задания " + i + "-го урока");
            } else {
                System.out.println("Я не выполнил все домашние задания " + i + "-го урока");
            }
        }
    }
}
