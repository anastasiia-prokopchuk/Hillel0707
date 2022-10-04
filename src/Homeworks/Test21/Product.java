package Homeworks.Test21;

public abstract class Product {

    protected Product(String product, String number, int price) {
        this.number = number;
        this.product = product;
        this.price = price;
    }

    String number;
    String product;
    int price;

    @Override
    public String toString() {
        return number + " " + product + " " + price + " грн";
    }

}
