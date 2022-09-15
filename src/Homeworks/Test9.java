package Homeworks;

public class Test9 {
    public static void main(String[] args) {

        String[][] stars = new String[3][5];
        for (int i = 0; i < stars.length; i++) {

            for (int j = 0; j < stars[i].length; j++) {

                stars[i][j] = "* ";
                System.out.print(stars[i][j]);

            }

            System.out.println();
        }
    }
}
