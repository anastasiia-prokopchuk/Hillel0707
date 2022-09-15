package Lessons.lesson14.outerClasses;

public class OuterLocalMethod {

    void my_Method() {
        int num = 888;

        //локальний метод внутрішнього класу
        class MethodInner_Demo {
            public void print() {
                System.out.println("Це метод внутрішнього класу " + num);
            }
        }

        MethodInner_Demo methodInner_demo = new MethodInner_Demo();
        methodInner_demo.print();
    }
}
