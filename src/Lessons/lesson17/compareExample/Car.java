package Lessons.lesson17.compareExample;

public class Car {


    String model;
    int year;

    public Car(String model, int year) {
        this.year = year;
        this.model = model;
    }


    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                '}';
    }

//    @Override
//    public int compareTo(Car o) {
//        return this.model.compareTo(String.valueOf(model));
//    }


    //    @Override
//    public int compareTo(Car o) {
//        if (this.year == o.year) {
//            return 0;
//        } else if (this.year < o.year) {
//            return -1;
//        } else {
//            return 1;
//        }
//    }
}
