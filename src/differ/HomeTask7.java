package differ;

import java.util.Scanner;

public class HomeTask7 {
    public static void main(String[] args) {

        int number1 = getInt();
        int number2 = getInt();
        char operation = getOperation();
        int result = calc(number1, number2, operation);
        System.out.println("Результат вычислений " + result);

    }

    public static int getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scanner.nextInt();
        return number;
    }

    public static char getOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имвол +, -, * или /: ");
        char operation = scanner.nextLine().charAt(0);
        return operation;
    }

    public static int calc(int num1, int num2, char operation) {
        int result = 0;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                ;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Я не знаю такого символа");
        }
        return result;
    }


}
