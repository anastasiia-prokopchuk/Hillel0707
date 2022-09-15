package Lessons.lesson11.constructor;

import Lessons.lesson9.overwriting.Animal;

public class Animal_yavnii {

    public Animal_yavnii() {

    }

    public Animal_yavnii(String name, int age) {
        this.name = name;
        this.age = age;
    }


    private String name;
    private int age;


    void sayName() {
        System.out.println(name);
    }

    void sayAge() {
        System.out.println(age);
    }

    void sayHello() {
        System.out.println("Hello");
    }


}
