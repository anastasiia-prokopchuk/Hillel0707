package Lessons.lesson14.outerClasses;

public class Outer {

    int num;

    private static class Inner_Demo {
        public void print() {
            System.out.println("Це внутрішній клас");
        }
    }

    void display_Inner() {
        Inner_Demo inner_demo = new Inner_Demo();
        inner_demo.print();
    }

}
