package Homeworks.Test21;

import java.util.ArrayList;
import java.util.List;

public class Burger {

    public Burger() {
        products.add(new Sauce());
        products.add(new Cheese());
        products.add(new Cutlet());
    }

    private final List<Product> selectedProducts = new ArrayList<>();
    private final List<Product> products = new ArrayList<>();
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


    public List<Product> addProduct(String addedProduct, boolean multipleChoice) {
        boolean productNotSelected = true;
        for (Product pr : products) {
            if (pr.number.equals(addedProduct) || pr.product.equalsIgnoreCase(addedProduct)) {
                productNotSelected = false;
                System.out.println("Вы выбрали " + pr.product);

                if (multipleChoice) {
                    selectedProducts.add(pr);
                } else {
                    if (selectedProducts.contains(pr)) {
                        System.out.println("Этот продукт уже добавлен.");
                    } else {
                        selectedProducts.add(pr);
                    }
                }

            }
        }
        if (productNotSelected) {
            System.out.println("Такого продукта нет");
        }

        return selectedProducts;
    }

    public void printTotalSum(List<Product> selectedProducts) {
        int totalSum = PRICE;
        for (Product selectedProd : selectedProducts) {
            totalSum += selectedProd.price;
        }
        System.out.println("Стоимость вашего заказа: " + totalSum + " грн");
    }
}


