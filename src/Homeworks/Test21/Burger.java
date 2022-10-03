package Homeworks.Test21;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

    public void burgerConstructor() {
        String anotherProduct;
        boolean addNewProduct;
        boolean choiceMade;
        boolean multipleChoice = false;

        do {
            System.out.println("Введите номер или название продукта.");
            Scanner scanner = new Scanner(System.in);
            String enteredProduct = scanner.nextLine();
            addProduct(enteredProduct, multipleChoice);

            do {
                System.out.println("Вы хотите добавить ингридиент? Да/Нет");
                Scanner scannerChoice = new Scanner(System.in);
                anotherProduct = scannerChoice.nextLine();

                choiceMade = true;
                if (anotherProduct.equalsIgnoreCase("да")) {
                    addNewProduct = true;
                } else if (anotherProduct.equalsIgnoreCase("нет")) {
                    addNewProduct = false;
                } else {
                    System.out.println("Вы введи неверные данные. Введите 'Да' или 'Нет'.");
                    choiceMade = false;
                    addNewProduct = true;
                }
            } while (!choiceMade);

        } while (addNewProduct);
    }


    public void addProduct(String addedProduct, boolean multipleChoice) {
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
    }

    public void printTotalSum() {
        int totalSum = PRICE;
        for (Product selectedProd : selectedProducts) {
            totalSum += selectedProd.price;
        }
        System.out.println("Стоимость вашего заказа: " + totalSum + " грн");
    }
}


