package Mentor.mentor3.person;

public class Employee extends Person {

    private String salary;

    public Employee(String lastName, String firstName, String address, String salary) {
        super(lastName, firstName, address);
        this.salary = salary;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Номер банковского счета " + this.salary);
    }


}
