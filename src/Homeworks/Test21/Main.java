package Homeworks.Test21;

import java.util.Scanner;

public class Main extends Burger {

    public static void main(String[] args) {

        System.out.println("Соберите бургер мечты!");
        Burger burger = new Burger();
        burger.burgerPrice();
        burger.printAllProduct();
        BurcerConstrucror burcerConstrucror = new BurcerConstrucror();
        burcerConstrucror.addNewProduct();
    }
}
