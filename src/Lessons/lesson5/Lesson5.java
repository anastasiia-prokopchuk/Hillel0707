package Lessons.lesson5;

import java.util.Arrays;

public class Lesson5 {
    public static void main(String[] args) {

        int[][] twoDamArray = new int[3][4];
        twoDamArray[0][0] = 5;
        twoDamArray[0][1] = 4;
        twoDamArray[0][2] = 4;
        twoDamArray[0][3] = 4;

        System.out.println(twoDamArray[0][1]);
        System.out.println(twoDamArray[1][1]);

        int[][] twoDamArray2 = {{2, 5, 7, 13}, {7, 4, 2, 3}, {2, 3, 4, 7}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" " + twoDamArray2[i][j] + " ");
            }
            System.out.println();
        }


        for (int i = 0; i < twoDamArray2.length; i++) {
            System.out.println(twoDamArray2[i].length + " Langth");
            for (int j = 0; j < twoDamArray2[i].length; j++) {
                System.out.print(" " + twoDamArray2[i][j] + " ");
            }
            System.out.println();
        }


        int[][] twoDamArray3 = {{2, 5, 7, 13}, {7, 4, 2, 3}, {2, 3, 4, 7}};
        System.out.println(Arrays.deepToString(twoDamArray3));
        //самый быстрый способ


        sayHello();

        mySum(3, 5);
        mySum(6, 5);

        int mathOperation = mySum2(10, 2);
        int finalResult = mathOperation + 7;
        System.out.println(finalResult);


        sayNameAndAge("Nastya", 28);

    }

    static void sayHello() {
        System.out.println("Hello world!");
    }

    static void mySum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);

    }

    static int mySum2(int a, int b) {
        int sum = a + b;
        return sum;
    }

    static void sayNameAndAge(String name, int age) {
        System.out.println(name + " " + age);
    }

}
