package Homeworks;

public class Test8 {

    public static void main(String[] args) {

        int result = minValue(7, 3);
        System.out.println(result);

    }

    static int minValue(int number1, int number2) {

        if (number1 < number2) {
            return number1;
        }
        return number2;

    }
}
