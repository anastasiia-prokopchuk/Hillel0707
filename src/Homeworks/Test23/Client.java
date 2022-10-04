package Homeworks.Test23;

public abstract class Client {
    public Client(double accountSum) {
        this.accountSum = accountSum;
    }

    double accountSum;

    abstract void refillAccount();

    abstract void withdrawalFromAccount();

    abstract void printBalance();

    abstract void printTerms();

}
