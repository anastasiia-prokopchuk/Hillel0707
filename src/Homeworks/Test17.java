package Homeworks;

public class Test17 {
    public static void main(String[] args) {
        int[] number = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                System.out.println("Вот счастливое число " + number[i - 1]);
                break;
            }
        }
    }

}
