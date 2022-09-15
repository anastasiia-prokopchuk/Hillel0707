package Mentor.mentor3.person;

public class Person {
    protected String lastName;
    protected String firstName;
    protected String address;

    public Person(String lastName, String firstName, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }


    public void display() {
        System.out.println(this.firstName + " " + this.lastName);
        System.out.println(address);
    }
}
