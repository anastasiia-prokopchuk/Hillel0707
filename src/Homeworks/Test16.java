package Homeworks;

import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {

        int number1 = getInt();
        int number2 = getInt();
        char operation = getOperation();
        int result = calc(number1, number2, operation);
        System.out.println("Результат вычислений " + result);

    }

    public static int getInt() {
        int number = 0;
        boolean isNumber = false;

        while (!isNumber) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число:");

            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                isNumber = true;
            } else {
                System.out.println("Вы ввели не целое число. Повторите ввод");
            }
        }
        return number;
    }

    public static char getOperation() {
        char operation = ' ';
        boolean isOperation = false;

        while (!isOperation) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите имвол +, -, * или /: ");
            char enteredOperation = scanner.nextLine().trim().charAt(0);

            if (enteredOperation == '*' || enteredOperation == '/' || enteredOperation == '-' || enteredOperation == '+') {
                operation = enteredOperation;
                isOperation = true;
            } else {
                System.out.println("Вы ввели неверный символ.");
            }
        }
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
                System.out.println("Расчет не удался. Запусите программу еще раз");
        }
        return result;
    }
}
