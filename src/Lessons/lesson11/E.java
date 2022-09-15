package Lessons.lesson11;

public class E {

    public E() {
        System.out.println("Метод построения без параметров");
    }


    public E(int value) {
        System.out.println("Метод построения с параметром " + value);
    }

}

class J extends E {
    public J() {
        System.out.println("J - построения без параметров");
    }

    public J(int value) {
        super(5);
        System.out.println("Метод построения J с параметром " + value);
    }

}
