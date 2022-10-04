package Homeworks.Test22;

import java.util.Scanner;

public class AccountAction {

    public void printAccountAction() {
        System.out.println("Что Вы хотите сделать? (Введите номер действия)");

        for (AllAccountAction action : AllAccountAction.values()) {
            System.out.println(action);
        }
    }

    public void selectAction(Client userType) {
        boolean selectAnotherAction = true;

        do {
            startAccountAction(userType);
            System.out.println("Хотите выполнить еще действие?(нет или да)");
            String userAnswer = new Scanner(System.in).nextLine();

            if (userAnswer.equalsIgnoreCase("нет")) {
                selectAnotherAction = false;
            } else {
                System.out.println("Введите номер действия");
            }

        } while (selectAnotherAction);
    }


    public void startAccountAction(Client clientType) {
        int userEnteredAction = new Scanner(System.in).nextInt();

        switch (userEnteredAction) {
            case 1 -> clientType.refillAccount();
            case 2 -> clientType.withdrawalFromAccount();
            case 3 -> clientType.printBalance();
            case 4 -> clientType.printTerms();
        }
    }
}
