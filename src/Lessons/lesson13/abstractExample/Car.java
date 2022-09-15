package Lessons.lesson13.abstractExample;

abstract class Car {


    String modal;
    int year;

    public Car() {

    }


    public Car(String modal, int year) {
        this.modal = modal;
        this.year = year;
    }

    abstract String maxSpeed();

    abstract void drive();

    abstract void brake();

    void countWheels() {

        System.out.println("4");
    }

}
