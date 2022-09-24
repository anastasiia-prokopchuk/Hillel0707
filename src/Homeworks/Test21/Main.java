package Homeworks.Test21;

import java.util.Scanner;

public class Main extends Burger {

    public static void main(String[] args) {

        System.out.println("Соберите бургер мечты!");
        Burger burger = new Burger();
        burger.burgerPrice();
        burger.printAllProduct();

        String anotherProduct;
        boolean addNewProduct;
        boolean selectAnotherProduct;
        do {
            System.out.println("Введите номер или название продукта.");
            Scanner scanner = new Scanner(System.in);
            String enterProduct = scanner.nextLine();
            burger.addProduct(enterProduct);

            do {
                System.out.println("Вы хотите добавить ингридиент? Да/Нет");
                Scanner scannerAnother = new Scanner(System.in);
                anotherProduct = scannerAnother.nextLine();

                selectAnotherProduct = true;
                if (anotherProduct.equalsIgnoreCase("да")) {
                    addNewProduct = true;
                } else if (anotherProduct.equalsIgnoreCase("нет")) {
                    addNewProduct = false;
                } else {
                    System.out.println("Вы введи неверные данные. Введите 'Да' или 'Нет'.");
                    addNewProduct = true;
                    selectAnotherProduct = false;
                }
            } while (!selectAnotherProduct);

        } while (addNewProduct);

        burger.printTotalSum();
    }
}
