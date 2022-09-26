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
    private final int PRICE = 50;
    String name = "Бургер";

    @Override
    public String toString() {
        return name + " " + PRICE + " грн";
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

    public void addProduct(String addedProduct) {
        boolean productNotSelected = true;
        for (Product pr : products) {
            if (pr.number.equals(addedProduct) || pr.product.equalsIgnoreCase(addedProduct)) {
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
        int totalSum = PRICE;
        for (Product selectedProd : selectedProducts) {
            totalSum += selectedProd.price;
        }
        System.out.println("Стоимость вашего заказа: " + totalSum + " грн");
    }
}


