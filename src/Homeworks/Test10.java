package Homeworks;

public class Test10 {
    public static void main(String[] args) {

        String line = ("         ");
        int center = line.length() / 2;
        char[] result = line.toCharArray();

        for (int i = 0; i < center + 1; i++) {

            for (int j = 0; j < i + 1; j++) {
                result[(center - i) + (2 * j)] = '*';
            }
            System.out.println(result);

            result = line.toCharArray();

        }
    }
}
