package Homeworks;

public class Test18 {
    public static void main(String[] args) {
        int[] numberArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int number : numberArray) {
            if (number % 2 == 0) {
                number = 0;
            }
            System.out.print(number + " ");
        }
    }
}
