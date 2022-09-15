package differ;

import java.util.Arrays;

public class Mentor2test {
    /**
     * Дано: массив целых чисел.
     * Требуется: Вывести на консоль отдельно чётные и нечётные числа.
     * Пример. Массив: 5, -3, -8, 81, 13
     * Вывод:
     * Чётные числа: -8
     * Нечётные: 5, -3, 81, 13
     * Примечание:
     * Вычисление чета и нечета должны быть оформлены в виде функций, которая как параметр берет
     * в себя исходный массив и возвращает вычисленый массив.
     * Печать на консоль должна быть оформлена в виде функции, которая на вход берет массив и выводит его на консоль,
     * используя цикл while. При этом формат должен быть:
     * <число>, <число>, <число>. В конце без запятой
     */
    public static void main(String[] args) {
        int[] array = {5, -3, -8, 81, 13};


        int[] rasp = oddNumber(array);
        System.out.println(rasp);
    }


    public static int[] oddNumber(int[] array) {
        int[] oddArray = new int[0];

        for (int number : array) {
            if (number % 2 != 0) {
                oddArray = Arrays.copyOf(oddArray, oddArray.length + 1);
                oddArray[oddArray.length - 1] = number;

            }
        }
        //System.out.println(oddArray);
        return oddArray;
    }


}
