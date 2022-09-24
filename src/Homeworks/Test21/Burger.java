package Homeworks.Test21;

import java.util.ArrayList;
import java.util.List;

public class Burger {

    public Burger() {
        products.add(new Sauce());
        products.add(new Cheese());
        products.add(new Cutlet());
    }

    private final List<Product> selectedProducts = new ArrayList<Product>();
    private final List<Product> products = new ArrayList<Product>();
    private final int price = 50;
    String name = "Бургер";

    @Override
    public String toString() {
        return name + " " + price + " грн";
    }

    public void burgerPrice() {
        System.out.println(this);
    }

    public void printAllProduct() {
        System.out.println("Вы можете выбрать дополнительные продукты:");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void addProduct(String addProduct) {
        boolean productNotSelected = true;
        for (Product pr : products) {
            if (pr.number.equals(addProduct) || pr.product.equalsIgnoreCase(addProduct)) {
                productNotSelected = false;
                System.out.println("Вы выбрали " + pr.product);
                selectedProducts.add(pr);
            }
        }
        if (productNotSelected) {
            System.out.println("Такого продукта нет");
        }
    }

    public void printTotalSum() {
        int totalSum = price;
        for (Product selectedProd : selectedProducts) {
            totalSum += selectedProd.price;
        }
        System.out.println("Стоимость вашего заказа: " + totalSum + " грн");
    }
}


