package differ;

public class T12 {

    public static void main(String[] args) {
        int max = 100;


        for (int i = 1; i <= max; i++) {
            boolean divisionInto3 = i % 3 == 0;
            boolean divisionInto5 = i % 5 == 0;

            if (divisionInto3 && divisionInto5) {
                System.out.print("HelloWorld ");
            } else if (divisionInto3) {
                System.out.print("Hello ");
            } else if (divisionInto5) {
                System.out.print("World ");
            } else {
                System.out.print(i + " ");
            }


        }
    }


}
