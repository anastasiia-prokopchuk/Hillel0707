package differ;

import java.util.Scanner;


public class Test10best {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть пробіли: ");
        String line = scanner.nextLine();

        int center;
        char[] result = line.toCharArray();

        if (line.length() % 2 == 0) {
            center = (line.length() - 1) / 2;
        } else {
            center = line.length() / 2;
        }


        for (int i = 0; i < center + 1; i++) {

            for (int j = 0; j < i + 1; j++) {
                result[center - i + (2 * j)] = '*';
            }
            System.out.println(result);

            for (int j = 0; j < line.length(); j++) {
                result[j] = ' ';
            }
        }
    }


}
