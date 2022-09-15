package Mentor.mentor3.person;

public class Customer extends Person {

    private String account;

    public Customer(String lastName, String firstName, String address, String account) {
        super(lastName, firstName, address);
        this.account = account;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Номер банковского счета " + this.account);
    }

}
