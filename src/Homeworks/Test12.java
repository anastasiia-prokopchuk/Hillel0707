package Homeworks;

public class Test12 {
    public static void main(String[] args) {
        int max = 100;

        for (int i = 1; i <= max; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("HelloWorld ");
            } else if (i % 3 == 0) {
                System.out.print("Hello ");
            } else if (i % 5 == 0) {
                System.out.print("World ");
            } else {
                System.out.print(i + " ");
            }

        }

    }

}
