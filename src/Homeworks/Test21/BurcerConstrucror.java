package Homeworks.Test21;

import java.util.List;
import java.util.Scanner;

public class BurcerConstrucror {

    public List<Product> addNewProduct() {
        String anotherProduct;
        boolean addNewProduct;
        boolean choiceMade;
        boolean multipleChoice = false;
        Burger burger = new Burger();

        List<Product> productList;

        do {
            System.out.println("Введите номер или название продукта.");
            Scanner scanner = new Scanner(System.in);
            String enteredProduct = scanner.nextLine();

            productList = burger.addProduct(enteredProduct, multipleChoice);

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


        return productList;

    }


}
