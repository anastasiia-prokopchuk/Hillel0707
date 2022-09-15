package Lessons.lesson13.interfaceExample;

public interface Parts {

    void hoodOrder();

    void wheelsOrder();

    void filtersOrder();

    default void countWheels() {
        System.out.println("4");
    }

}
