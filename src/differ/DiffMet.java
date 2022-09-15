package differ;

import java.util.Arrays;
import java.util.Locale;

public class DiffMet {
    public static void main(String[] args) {

        int[][] twoDamArray3 = {{2, 5, 7, 13}, {7, 4, 2, 3}, {2, 3, 4, 7}};
        //System.out.println(Arrays.deepToString(twoDamArray3));

        int sum = myArr(1, 2);
        //System.out.println(sum);

        String text1 = "Hello, I'm Nastya";
        String text2 = " Sorry Mally ";
        String text3 = "Hello, I'm Nastya";
        String text4 = "I'm";
        System.out.println(text1);

        System.out.println(text1.length());
        System.out.println(text1.concat(text2));
        System.out.println(text2.trim() + "987");


        boolean end1 = text1.endsWith("Nastya");
        boolean end2 = text1.endsWith("Hanna");
        System.out.println(end1);
        System.out.println(end2);

        System.out.println(text1.toUpperCase(Locale.ROOT));
        System.out.println(text1.toLowerCase(Locale.ROOT));

        System.out.println(text1.equals(text2));
        System.out.println(text1.equals(text3));

        System.out.println("//");

        System.out.println(text1.contains(text4));
        System.out.println(text1.contains(text2));


        System.out.println(text1.charAt(5));


    }

    static int myArr(int a, int b) {
        int result = a + b;
        return result;
    }


}
