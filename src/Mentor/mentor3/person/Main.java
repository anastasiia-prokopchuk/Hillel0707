package Mentor.mentor3.person;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee("Ivanov", "Ivan", "Kyiv", "555");
        Customer customer = new Customer("Petrenko", "Petro", "London", "123123123123");
        employee.display();
        System.out.println("-----------------------");
        customer.display();
    }
}
