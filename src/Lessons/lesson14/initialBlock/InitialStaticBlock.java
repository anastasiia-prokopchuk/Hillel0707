package Lessons.lesson14.initialBlock;

public class InitialStaticBlock {
    static int i;

    static {
        i = 25;
    }

    public static void main(String[] args) {
        System.out.println(i);
    }
}
