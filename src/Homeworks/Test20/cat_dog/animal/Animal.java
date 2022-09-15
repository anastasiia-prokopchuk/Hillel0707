package Homeworks.Test20.cat_dog.animal;

public class Animal {
    public String animalType;
    public String name;
    public String voice;

    public Animal(String animalType, String name, String voice) {
        this.animalType = animalType;
        this.name = name;
        this.voice = voice;
    }

    public void sound() {
        System.out.println("I am a " + this.animalType + ". My name is " + this.name + ". " + this.voice);
    }


}
